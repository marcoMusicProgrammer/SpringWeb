package com.generation.freelancerspring.controller;

import com.generation.freelancerspring.model.entities.Contract;
import com.generation.freelancerspring.model.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller")
public class ContractController
{
	@Autowired
	private ContractRepository repo;
}
