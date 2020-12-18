package fr.esiea.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import fr.esiea.models.Formulaire;
import fr.esiea.models.Response;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class SondageController {

	private static final String template = "Hello, %s!";
	private List<Formulaire> forms = new ArrayList<>();
	private List<Response> responses = new ArrayList<>();
	private AtomicLong counterRep = new AtomicLong();
	private AtomicLong nextId = new AtomicLong();

	@PostMapping("/form")
	public Formulaire creatForm(@RequestBody Formulaire form) {
		form.setId((int) nextId.incrementAndGet());
		forms.add(form);
		return form;
	}

	@GetMapping("/getform")
	public Formulaire getFrom(){

		Formulaire f = new Formulaire();
		f.setId((int) nextId.incrementAndGet());
		forms.add(f);
		return f;
	}

	@GetMapping("/getthisform")
	public Formulaire getFrom(@RequestParam String id){
		int i = Integer.parseInt(id)-1;
		return forms.get(i);
	}

	@GetMapping("/getallform")
	public List<Formulaire> getAllFrom(){
		return forms;
	}

	@PostMapping("/response")
	public Response postResponse(@RequestBody Response rep) {

		Response r = rep;
		for(int k= 0; k < responses.size(); k++){
			if (r.getUser().equals(responses.get(k).getUser())){
				return r;
			}
		}
		r.setId((int) counterRep.incrementAndGet());
		responses.add(rep);
		return r;
	}

	@GetMapping("/getallresp")
	public List<Response> getAllResp(){
		return responses;
	}

	@GetMapping("/gethisresp")
	public List<Response> getResp(@RequestParam String user){
		List<Response> userRep = new ArrayList<>();

		for(int k = 0; k < responses.size() ; k++ ){
			if (responses.get(k).getUser().equals(user))
				userRep.add(responses.get(k));
		}
		return userRep;
	}

}