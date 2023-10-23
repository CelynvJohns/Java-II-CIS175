package helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Bookstore;

public class BookstoreHelper {
EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookDataBase");
	
	//method to add bookstore
	public void add(Bookstore model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	//method to delete bookstore
	public void delete(Bookstore model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Bookstore.class, model.getId()));
		manager.getTransaction().commit();
		manager.close();
	}
	  
	//method to search for Bookstore using JPQL query
	public Bookstore searchBookstoreByTitle(String title) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Bookstore> query = manager.createQuery("SELECT i FROM bookstore AS i WHERE i.title = :title", Bookstore.class);
		query.setParameter("title", title);
		Bookstore dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
	
	//method to update bookstore
	public void update(Bookstore model) {
		EntityManager manager = factory.createEntityManager();
		Bookstore dbEntity = manager.find(Bookstore.class, model.getId());
		manager.getTransaction().begin();
		dbEntity.setTitle(model.getTitle());
		dbEntity.setAuthor(model.getAuthor());
		dbEntity.setPublishedYear(model.getPublishedYear());
		dbEntity.setGenre(model.getGenre());
		manager.getTransaction().commit();
		manager.close();
		
	}
	 
	// method to show Bookstore using JPQL query
	@SuppressWarnings("unchecked")
	public List<Bookstore> showAllBookstore() {
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM bookstore i");
		List<Bookstore> allItems = q.getResultList();
		manager.close();
		return allItems;
		
	}

}
