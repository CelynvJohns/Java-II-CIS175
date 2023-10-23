package helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Pet;

public class PetHelper {
EntityManagerFactory factory = Persistence.createEntityManagerFactory("PetsJohns");
	
	//method to add pet
	public void add(Pet model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	//method to delete pet
	public void delete(Pet model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Pet.class, model.getId()));
		manager.getTransaction().commit();
		manager.close();
	}
	  
	//method to search for Pet using JPQL query
	public Pet searchPetByBreed(String breed) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Pet> query = manager.createQuery("SELECT i FROM pet AS i WHERE i.breed = :breed", Pet.class);
		query.setParameter("breed", breed);
		Pet dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
	
	//method to update pet
	public void update(Pet model) {
		EntityManager manager = factory.createEntityManager();
		Pet dbEntity = manager.find(Pet.class, model.getId());
		manager.getTransaction().begin();
		dbEntity.setType(model.getType());
		dbEntity.setBreed(model.getBreed());
		manager.getTransaction().commit();
		manager.close();
		
	}
	 
	// method to show Pet using JPQL query
	@SuppressWarnings("unchecked")
	public List<Pet> showAllPet() {
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM pet i");
		List<Pet> allItems = q.getResultList();
		manager.close();
		return allItems;
		
	}

}
