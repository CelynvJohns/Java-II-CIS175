package helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.PetDescription;

public class PetDescriptionHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PetsJohns");
	PetHelper petHelper = new PetHelper();

	// method to add Pet Description
	public void add(PetDescription model) {
		EntityManager manager = factory.createEntityManager();
		model.setPet(petHelper.searchPetByBreed(model.getPet().getBreed()));
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();

	}

	// method to delete Pet Description
	public void delete(PetDescription model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(PetDescription.class, model.getPdId()));
		manager.getTransaction().commit();
		manager.close();
	}

	// method to search for pet Descriptions using JPQL query
	public PetDescription searchByPetDescriptionName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<PetDescription> query = manager.createQuery("SELECT i FROM petDescription AS i WHERE i.name = :name", PetDescription.class);
		query.setParameter("name", oldName);
		PetDescription dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}

	// method to update Pet Description
	public void update(PetDescription model) {
		EntityManager manager = factory.createEntityManager();
		model.setPet(petHelper.searchPetByBreed(model.getPet().getBreed()));
		PetDescription dbEntity = manager.find(PetDescription.class, model.getPdId());
		manager.getTransaction().begin();
		dbEntity.setName(model.getName());
		dbEntity.setAge(model.getAge());
		dbEntity.setPattern(model.getPattern());
		dbEntity.setTemperament(model.getTemperament());
		dbEntity.setSize(model.getSize());
		dbEntity.setPet(model.getPet());
		manager.getTransaction().commit();
		manager.close();

	}

	
	// method to show Pet Description using JPQL query
	@SuppressWarnings("unchecked")
	public List<PetDescription> showAllPetDescription() {
		EntityManager manager = factory.createEntityManager();
		List<PetDescription> allItems = manager.createQuery("SELECT i FROM petDescription i").getResultList();
		manager.close();
		return allItems;

	}

}
