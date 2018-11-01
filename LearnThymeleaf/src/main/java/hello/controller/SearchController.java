package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import hello.model.Store;
import hello.service.Search;

@Controller
public class SearchController {

	@GetMapping("/store")
	public String greetingForm(Model model) {
		model.addAttribute("store", new Store());
		return "greeting";
	}

	@PostMapping("/store")
	public String greetingSubmit(@ModelAttribute Store store, Model model) {
		Search search = new Search();

		store = search.getSearch(store.getQ());
		model.addAttribute("store", store);

		System.out.println("Title: " + store.getTitle().getTitle());
		return "result";
	}
}
