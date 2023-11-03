package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.Characters;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.CharacterRepository;

@SpringBootApplication
public class CartoonCharactersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CartoonCharactersApplication.class, args);
	}
	
	@Autowired
	CharacterRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
				Characters c = appContext.getBean("character", Characters.class);
				c.setCartoon("Adventure Time");
				repo.save(c);
				
				//Create a bean to use - not managed by Spring
				Characters d = new Characters("Shaggy", "Rogers", "Scooby-Doo", 17);
				Address a = new Address("Roggers Mansion", "Crystal Cove", "California USA");
				d.setAddress(a);
				repo.save(d);
		
		List<Characters> allMyCharacters = repo.findAll();
		for(Characters people: allMyCharacters) {
			System.out.println(people.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}

}

