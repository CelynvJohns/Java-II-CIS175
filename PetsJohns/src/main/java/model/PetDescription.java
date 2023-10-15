package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "petDescription")
@Table(name = "petDescription")
public class PetDescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String age;
	private String pattern;
	private String tempermant;
	private String size;
	@ManyToOne
	@JoinColumn(name = "ID", nullable=false)
	private Pet pet = new Pet();

	
	public PetDescription() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getTempermant() {
		return tempermant;
	}

	public void setTempermant(String tempermant) {
		this.tempermant = tempermant;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "PetDescription [Id=" + Id + ", name=" + name + ", age=" + age + ", pattern=" + pattern + ", tempermant="
				+ tempermant + ", size=" + size + ", pet=" + pet + "]";
	}
	
	
	
}
