package com.generation.freelancerspring.controller;

import com.generation.freelancerspring.model.entities.Contract;
import com.generation.freelancerspring.model.entities.Employer;
import com.generation.freelancerspring.model.repositories.ContractRepository;
import com.generation.freelancerspring.model.repositories.EmployerRepository;
import com.generation.freelancerspring.model.repositories.FreelancerRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/contract")
public class ContractController
{
	@Autowired
	private ContractRepository repoContract;

	@Autowired
	private EmployerRepository employerRepo;

	@Autowired
	private FreelancerRepository freelancerRepo;

	@PostMapping
	public String inserisciContract(@ModelAttribute Contract contract, @RequestParam int id)
	{
		System.out.println(contract);
		contract.setEmployer(employerRepo.findById(id).get());
		repoContract.save(contract);
		return "redirect:/employer";
	}

}
