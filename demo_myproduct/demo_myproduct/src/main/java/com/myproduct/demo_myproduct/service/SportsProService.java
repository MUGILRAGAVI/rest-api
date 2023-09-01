package com.myproduct.demo_myproduct.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.myproduct.demo_myproduct.entities.ProductEntities;
import com.myproduct.demo_myproduct.repository.SportsProRepository;

@Service

public class SportsProService {
	@Autowired
	SportsProRepository SportsproRepository;
	public ProductEntities saveinfo(ProductEntities productentities)
	{
		return SportsproRepository.save(productentities);
	}
	public List<ProductEntities> showinfo()
	{
		return SportsproRepository.findAll();
	}
	public Optional<ProductEntities> sow(int id)
	{
		return SportsproRepository.findById(id);
	}
	public String changeinfoid(int id,ProductEntities productrepository)
	{
		SportsproRepository.saveAndFlush(productrepository);
		if(SportsproRepository.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid Id";
		}
	}
	public void deleteid(int id)
	{
		SportsproRepository.deleteById(id);
	}
    
public List<ProductEntities> sortinfo (String s)
{
	return SportsproRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
}
public List<ProductEntities> getbypage (int pageno, int pagesize)
{
	Page<ProductEntities> p=SportsproRepository.findAll(PageRequest.of(pageno,pagesize));
	return p.getContent();
}

	
	

}
