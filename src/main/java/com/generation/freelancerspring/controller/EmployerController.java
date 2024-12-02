package com.generation.freelancerspring.controller;

import com.generation.freelancerspring.model.entities.Contract;
import com.generation.freelancerspring.model.entities.Employer;
import com.generation.freelancerspring.model.entities.Freelancer;
import com.generation.freelancerspring.model.repositories.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employer")
public class EmployerController
{
	@Autowired
	private EmployerRepository repo;

	@PostMapping
	public String inserisciEmployer(@ModelAttribute Employer employer)
	{
		repo.save(employer);
		return "redirect:/employer";
	}


	@GetMapping
	public String paginaMostraEmployer(Model model)
	{
		List<Employer> employers = repo.findAll();
		model.addAttribute("employers", employers);
		return "showAllEmployers";
	}

	@GetMapping("/detail")
	public String employerInDetails(@RequestParam int id, Model model,Model model2)
	{
		Employer employer = repo.findById(1).get();
		model.addAttribute("employer", employer);
		List<Contract> contracts = employer.getContracts();
 		model2.addAttribute("contract",contracts);
		return "employerInDetails";
	}
}
