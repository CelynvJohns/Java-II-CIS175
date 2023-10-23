package model;

/**
 * @author Celyn - jvjohns CIS175 - Fall 2023 | Oct 20, 2023
 */

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "pet")
@Table(name = "pet")
public class Pet {
	//instance variables
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String type;
		private String breed;		
		
		@OneToMany(mappedBy = "pet", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private List<PetDescription> petDescription;

		
		public Pet() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}

		public List<PetDescription> getPetDescription() {
			return petDescription;
		}

		public void setPetDescription(List<PetDescription> petDescription) {
			this.petDescription = petDescription;
		}

		@Override
		public String toString() {
			return "Pet [id=" + id + ", type=" + type + ", breed=" + breed + "]";
		}
		
		
}
