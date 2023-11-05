package dmacc.model;




import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Recipe {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String ingredients;
	private String instructions;
	private int minutes;
	private int hours;
	
	public Recipe () {
		super();
	}
	
	public Recipe(String name) {
		super();
		this.name = name;
	}
	
	public Recipe(String name, String ingredients, String instructions) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}
	public Recipe(long id, String name, String instructions, String ingredients, int minutes, int hours) {
		super();
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.instructions = instructions;
		this.hours = hours;
		this.minutes = minutes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", ingredients=" + ingredients + ", instructions=" + instructions
				+ ", minutes=" + minutes + ", hours=" + hours + "]";
	}

	
	
}