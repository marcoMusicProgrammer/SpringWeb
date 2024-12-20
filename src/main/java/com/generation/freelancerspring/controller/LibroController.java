package com.generation.freelancerspring.controller;

import com.generation.freelancerspring.model.entities.Libro;
import com.generation.freelancerspring.model.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/libro") // cattura le rchieste http://localhost:8080/libro
public class LibroController
{
	@Autowired
	private LibroRepository repo;

	@PostMapping
	public String inserisciLibro(@ModelAttribute Libro libro)
	{
		repo.save(libro);
		return "redirect:/libro";
	}

	@GetMapping
	public String paginaGestioneLibro(Model model)
	{
		List<Libro> libri = repo.findAll();
		model.addAttribute("libri", libri);
		return "gestoreLibro";
	}
}
