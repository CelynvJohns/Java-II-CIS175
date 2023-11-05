package dmacc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dmacc.repository.RecipeRepository;

@SpringBootApplication
public class RecipeStorerApplication{

	public static void main(String[] args) {
		SpringApplication.run(RecipeStorerApplication.class, args);
	}
	
	@Autowired
	RecipeRepository repo;

	public void run(String... args) throws Exception {
		
	}

}