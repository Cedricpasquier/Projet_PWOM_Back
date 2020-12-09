package fr.esiea.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import fr.esiea.models.Formulaire;
import fr.esiea.restservice.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

	private static final String template = "Hello, %s!";
	private List<Formulaire> forms = new ArrayList<>();
	private AtomicLong counter = new AtomicLong();
	private AtomicLong nextId = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}


	@PostMapping("/form")
	public Formulaire creatForm(@RequestBody Formulaire form) {
		//
		form.setId((int) nextId.incrementAndGet());
		forms.add(form);
		return form;
	}

	@GetMapping("/getform")
	public Formulaire getFrom(@RequestParam(value = "id", defaultValue = "0") int id){
		return
	}

}