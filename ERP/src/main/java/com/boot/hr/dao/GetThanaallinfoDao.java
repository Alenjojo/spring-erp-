package com.boot.hr.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.hr.model.GetThanaallinfo;

@Repository
public class GetThanaallinfoDao {
	@Autowired
	private EntityManager em;
	@SuppressWarnings("unchecked")
	public List<GetThanaallinfo> getGetThanaallinfo() {
		return em.createNamedStoredProcedureQuery("GetThanaallinfo").getResultList();
	}
}
