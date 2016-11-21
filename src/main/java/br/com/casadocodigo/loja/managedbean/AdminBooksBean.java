package br.com.casadocodigo.loja.managedbean;

import br.com.casadocodigo.loja.daos.AuthorDAO;
import br.com.casadocodigo.loja.daos.BookDAO;
import br.com.casadocodigo.loja.models.Author;
import br.com.casadocodigo.loja.models.Book;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by icc on 19/11/2016.
 */
@Model
public class AdminBooksBean {

    private Book product = new Book();
    private List<Author> authors = new ArrayList<>();
    private List<Integer> selectedAuthorsIds =
            new ArrayList<>();
    @Inject

    private BookDAO bookDAO;
    @Inject
    private AuthorDAO authorDAO;

    public AdminBooksBean() {
    }

    @PostConstruct
    public void loadObjects() {
        this.authors = authorDAO.list();
    }

    @Transactional
    public void save() {
        populateBookAuthor();
        bookDAO.save(product);
    }

    private void populateBookAuthor() {
        selectedAuthorsIds.stream().map((id) -> {
            return new Author(id);
        }).forEach(product::add);
    }

    public Book getProduct() {
        return product;
    }

    public void setProduct(Book product) {
        this.product = product;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Integer> getSelectedAuthorsIds() {
        return selectedAuthorsIds;
    }

    public void setSelectedAuthorsIds(List<Integer> selectedAuthorsIds) {
        this.selectedAuthorsIds = selectedAuthorsIds;
    }
}
