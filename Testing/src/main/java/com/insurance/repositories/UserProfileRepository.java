package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entity.UserProfile;



@Repository
public class UserProfileRepository {

	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public UserProfile save(UserProfile u){
		return em.merge(u);
	}
	
	@Transactional
	public UserProfile getById(int id){
		String sql = "select * from user_profile where id = " + id;
		Query q = em.createNativeQuery(sql, UserProfile.class);
		return (UserProfile)q.getSingleResult();
	}
	@Transactional
	public UserProfile update(UserProfile u){
		return em.merge(u);
	}
}
