package br.com.casadocodigo.loja.daos;

import br.com.casadocodigo.loja.models.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by icc on 19/11/2016.
 */
public class BookDAO {

    @PersistenceContext
    private EntityManager manager;

    public void save(Book product){
        manager.persist(product);
    }
}
