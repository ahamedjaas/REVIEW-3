package com.example.demo.AreaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.AreaModel.AreaDetails;

@Repository
public interface Arearepo extends JpaRepository<AreaDetails,Integer> {
	

}
