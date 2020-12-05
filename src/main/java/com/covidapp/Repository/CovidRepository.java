package com.covidapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.covidapp.Model.CovidModel;


public interface CovidRepository extends JpaRepository<CovidModel, Integer> {

	
	
}
 