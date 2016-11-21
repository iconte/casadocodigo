package br.com.casadocodigo.loja.daos;

import br.com.casadocodigo.loja.models.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by icc on 20/11/2016.
 */
public class AuthorDAO {
    @PersistenceContext
    private EntityManager manager;

    public List<Author> list(){
        return manager.createQuery("select a from Author a").getResultList();

    }

}
