package com.generation.freelancerspring.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Contract extends BaseEntity
{

	private String commission;
	private int payment;


	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;

	//N - 1

	@ManyToOne
	@JoinColumn(name = "freelancer_id")
	private Freelancer freelancer;//riferimento al padre
}
