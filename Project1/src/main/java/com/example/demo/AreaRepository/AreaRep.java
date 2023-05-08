package com.example.demo.AreaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.AreaModel.AreaDet;

@Repository
public interface AreaRep extends JpaRepository<AreaDet,Integer>{

}
