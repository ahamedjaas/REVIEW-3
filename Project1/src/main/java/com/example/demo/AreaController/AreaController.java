package com.example.demo.AreaController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AreaModel.AreaDet;
import com.example.demo.AreaModel.AreaDetails;
import com.example.demo.AreaService.Areaservice;

@RestController
@RequestMapping("/Area")
public class AreaController {
	@Autowired
	Areaservice arservice;
	
	@PostMapping("/did")
	public String create(@RequestBody AreaDetails area)
	{
		return arservice.addArea(area);
	}
	@GetMapping("")
	public List<AreaDetails> read()
	{
		return arservice.getArea();
	}
	@GetMapping("/{id}")
	public Optional<AreaDetails>readById(@PathVariable int id)
	{
		return arservice.getAreaById(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody AreaDetails area)
	{
		return arservice.updateArea(area);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("aid") int id)
	{
		arservice.deleteByRequestParam(id);
		return "deleted";
	}
	@GetMapping("/{field}")
	public List<AreaDetails>getAreaSorted(@PathVariable String field)
	{
		return arservice.getSorted(field);
	}
	@GetMapping("/{offset}/{pagesize}")
	public List<AreaDetails>getAreaPagination(@PathVariable int offset,@PathVariable int pagesize)
	{
		return arservice.getWithPagination(offset,pagesize);
	}
	@PostMapping("/hash")
	public AreaDet saveAreaDet(@RequestBody AreaDet a)
	{
		return arservice.saveAreaDet(a);
	}

}
