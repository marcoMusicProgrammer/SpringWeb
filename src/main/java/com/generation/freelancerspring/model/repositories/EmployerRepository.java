package com.generation.freelancerspring.model.repositories;

import com.generation.freelancerspring.model.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Integer>
{
}
