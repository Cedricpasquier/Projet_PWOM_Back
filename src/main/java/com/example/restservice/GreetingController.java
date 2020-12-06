package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.Model.Formulaire;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private List<Formulaire> forms = new ArrayList<>();
	private AtomicLong counter = new AtomicLong();
	private AtomicLong nextId = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}


	@PostMapping("/formulaire")
	public Formulaire creatFormulaire(@RequestBody Formulaire formulaire) {
		//
		formulaire.setId((int) nextId.incrementAndGet());
		forms.add(formulaire);
		return formulaire;
	}

}