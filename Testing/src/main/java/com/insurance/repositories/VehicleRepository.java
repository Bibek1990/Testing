package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entity.Vehicle;



@Repository
public class VehicleRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Vehicle save(Vehicle v){
		return em.merge(v);
	}
}
