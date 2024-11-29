package com.generation.freelancerspring.controller;

import com.generation.freelancerspring.model.entities.Freelancer;
import com.generation.freelancerspring.model.repositories.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/freelance")
public class FreelancerController
{
	@Autowired
	private FreelancerRepository repo;

	@PostMapping
	public String inserisciFreelancer(@ModelAttribute Freelancer freelancer)
	{
		repo.save(freelancer);
		return "redirect:/freelance";
	}

	@GetMapping
	public String paginaMostraFreelancers(Model model)
	{
		List<Freelancer> freelancers = repo.findAll();
		model.addAttribute("freelancers", freelancers);
		return "showAllFreelancers";
	}

	@GetMapping("/detail")
	public String freelancerInDetails(@RequestParam int id, Model model)
	{
		Freelancer freelancer = repo.findById(id).get();
		model.addAttribute("freelancer", freelancer);
		return "freelancerInDetails";
	}
}
