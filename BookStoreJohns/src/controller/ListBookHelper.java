package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListBook; // Import the ListBook class from the model package

public class ListBookHelper {
	// create EntityManager
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BookList");

    // inserting the book into the database
    public void insertBook(ListBook li) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(li);
        em.getTransaction().commit();
        em.close();
    }
    
    // printing the books in the database
    public List<ListBook> showAllBooks() {
        EntityManager em = emfactory.createEntityManager();
        String jpql = "SELECT i FROM ListBook i"; // JPQL query to select all books
        TypedQuery<ListBook> query = em.createQuery(jpql, ListBook.class);
        List<ListBook> allBooks = query.getResultList();
        em.close(); // Close the EntityManager when done
        return allBooks;
    }
    
    // deleteing books from the database
    public void deleteBook(ListBook toDelete) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<ListBook> typedQuery = em.createQuery(
            "SELECT li FROM ListBook li WHERE li.title = :selectedTitle AND li.author = :selectedAuthor",
            ListBook.class
        );

        // Substitute parameter with actual data from the toDelete book
        typedQuery.setParameter("selectedTitle", toDelete.getTitle());
        typedQuery.setParameter("selectedAuthor", toDelete.getAuthor());

        // We only want one result, but handle the case where no result is found
        try {
            typedQuery.setMaxResults(1);
            ListBook result = typedQuery.getSingleResult();

            // Remove it
            em.remove(result);
        } catch (NoResultException e) {
            // Handle the case where no matching entity is found
            System.out.println("No matching entity found for deletion.");
        }

        em.getTransaction().commit();
        em.close();
    }

    
    
// search for Book by Title
    public List<ListBook> searchForBookByTitle(String titleName) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<ListBook> typedQuery = em.createQuery("select li from ListBook li where li.title = :selectedTitle", ListBook.class);
        typedQuery.setParameter("selectedTitle", titleName);
        List<ListBook> foundBooks = typedQuery.getResultList();
        em.close();
        return foundBooks;
    }
    
// search for a Book by Author
    public List<ListBook> searchForBookByAuthor(String authorName) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<ListBook> typedQuery = em.createQuery("select li from ListBook li where li.author = :selectedAuthor", ListBook.class);
        typedQuery.setParameter("selectedAuthor", authorName);
        List<ListBook> foundBooks = typedQuery.getResultList();
        em.close();
        return foundBooks;
    }
    
    // search for a book by Id
    public ListBook searchForBookById(int idToEdit) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        ListBook found = em.find(ListBook.class, idToEdit);
        em.close();
        return found;
    }
    
    // update the book in the database
    public void updateBook(ListBook toEdit) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(toEdit);
        em.getTransaction().commit();
        em.close();
    }
    
    // close the menu
    public void cleanUp() {
        emfactory.close();
    }

}
