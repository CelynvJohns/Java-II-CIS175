package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListItem; // Import the ListItem class from the model package

public class ListItemHelper {
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ShoppingList");

    public void insertItem(ListItem li) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(li);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<ListItem> showAllItems() {
        EntityManager em = emfactory.createEntityManager();
        String jpql = "SELECT i FROM ListItem i"; // JPQL query to select all items
        TypedQuery<ListItem> query = em.createQuery(jpql, ListItem.class);
        List<ListItem> allItems = query.getResultList();
        em.close(); // Close the EntityManager when done
        return allItems;
    }
    
    public void deleteItem(ListItem toDelete) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<ListItem> typedQuery = em.createQuery(
            "SELECT li FROM ListItem li WHERE li.store = :selectedStore AND li.item = :selectedItem",
            ListItem.class
        );

        // Substitute parameter with actual data from the toDelete item
        typedQuery.setParameter("selectedStore", toDelete.getStore());
        typedQuery.setParameter("selectedItem", toDelete.getItem());

        // We only want one result
        typedQuery.setMaxResults(1);

        // Get the result and save it into a new list item
        ListItem result = typedQuery.getSingleResult();

        // Remove it
        em.remove(result);
        em.getTransaction().commit();
        em.close();
    }
    
    
// search for item by store
    public List<ListItem> searchForItemByStore(String storeName) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<ListItem> typedQuery = em.createQuery("select li from ListItem li where li.store = :selectedStore", ListItem.class);
        typedQuery.setParameter("selectedStore", storeName);
        List<ListItem> foundItems = typedQuery.getResultList();
        em.close();
        return foundItems;
    }
    
// search for item by item
    public List<ListItem> searchForItemByItem(String itemName) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<ListItem> typedQuery = em.createQuery("select li from ListItem li where li.item = :selectedItem", ListItem.class);
        typedQuery.setParameter("selectedItem", itemName);
        List<ListItem> foundItems = typedQuery.getResultList();
        em.close();
        return foundItems;
    }
    
    
    public ListItem searchForItemById(int idToEdit) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        ListItem found = em.find(ListItem.class, idToEdit);
        em.close();
        return found;
    }
    
    public void updateItem(ListItem toEdit) {
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(toEdit);
        em.getTransaction().commit();
        em.close();
    }
    
    public void cleanUp() {
        emfactory.close();
    }

}
