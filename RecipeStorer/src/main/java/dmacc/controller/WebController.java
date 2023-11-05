package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.model.Recipe;
import dmacc.repository.RecipeRepository;

@Controller
public class WebController {
	@Autowired
	RecipeRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllRecipes(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewRecipes(model);
		}

		model.addAttribute("recipes", repo.findAll());
		return "results";
	}

	@GetMapping("/inputRecipes")
	public String addNewRecipes(Model model) {
		Recipe r = new Recipe();
		model.addAttribute("newRecipes", r);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateRecipes(@PathVariable("id") long id, Model model) {
		Recipe r = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + r.toString());
		model.addAttribute("newRecipes", r);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseRecipes(Recipe r, Model model) {
		repo.save(r);
		return viewAllRecipes(model);
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Recipe c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllRecipes(model);
	}
}
