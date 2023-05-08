package com.example.demo.AreaService;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.AreaModel.AreaDet;
import com.example.demo.AreaModel.AreaDetails;
import com.example.demo.AreaRepository.AreaRep;
import com.example.demo.AreaRepository.Arearepo;

@Service
public class Areaservice {
	@Autowired
	Arearepo repository;
	@Autowired
	AreaRep repos;
	
	public String addArea(AreaDetails area)
	{
		repository.save(area);
		return "Added";
	}
	public List<AreaDetails> getArea()
	{
		return repository.findAll();
	}
	public Optional<AreaDetails> getAreaById(int id)
	{
		return repository.findById(id);
	}
	public String updateArea(AreaDetails area)
	{
		repository.save(area);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
	public List<AreaDetails>getSorted(String field)
	{
		return repository.findAll(Sort.by(field).descending());
	}
	public List<AreaDetails>getWithPagination(int offset,int pagesize)
	{
		Page<AreaDetails> ar=repository.findAll(PageRequest.of(offset,pagesize));
		return ar.getContent();
	}
	public AreaDet saveAreaDet(AreaDet a)
	{
		return repos.save(a);
	}
}
	

