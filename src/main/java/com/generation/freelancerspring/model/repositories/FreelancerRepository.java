package com.generation.freelancerspring.model.repositories;

import com.generation.freelancerspring.model.entities.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<Freelancer, Integer>
{
}
