package com.Catlog.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Catlog.Model.CatlogModel;
import com.Catlog.Repository.CatlogRepository;

@Service
public class CatlogServiceImpl implements CatlogService{
	
	private CatlogRepository catlogRepository;

	public CatlogServiceImpl(CatlogRepository catlogRepository) {
		super();
		this.catlogRepository = catlogRepository;
	}

	@Override
	public List<CatlogModel> getProductDetailsByCategory(String category) {
		return catlogRepository.getProductDetailsByCategory(category);
	}
	
	
	@Override
	public List<String> getAllCategory() {
		// TODO Auto-generated method stub
		return catlogRepository.getAllCategory();
	}

}
