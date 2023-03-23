package com.Catlog.Service;

import java.util.List;

import com.Catlog.Model.CatlogModel;

public interface CatlogService {
	
	List<CatlogModel> getProductDetailsByCategory(String category);
	List<String> getAllCategory();
	

}
