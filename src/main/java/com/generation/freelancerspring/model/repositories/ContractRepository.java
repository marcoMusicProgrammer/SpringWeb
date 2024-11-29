package com.generation.freelancerspring.model.repositories;

import com.generation.freelancerspring.model.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Integer>
{
}
