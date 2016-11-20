package br.com.casadocodigo.loja.managedbean;

import br.com.casadocodigo.loja.daos.BookDAO;
import br.com.casadocodigo.loja.models.Book;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Created by icc on 19/11/2016.
 */
@Model
public class AdminBooksBean {

    private Book product;

    @Inject
    private BookDAO bookDAO;

    public void save(Book product) {
        System.out.println(product);
    }

    public Book getProduct() {
        return product;
    }
}
