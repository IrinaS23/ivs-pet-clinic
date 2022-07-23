package irina.learingspringframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import irina.learingspringframework.ivspetclinic.services.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	
	
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping(value = {"/vets","/vets/index","/vets/index.html"}, method = RequestMethod.GET)
	public String listsVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
