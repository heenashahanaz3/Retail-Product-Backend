package com.Search.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.Search.Model.SearchModel;
import com.Search.Repository.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService{
	
	private SearchRepository searchrepository;


	public SearchServiceImpl(SearchRepository searchrepository) {
		super();
		this.searchrepository = searchrepository;
	}

	@Override
	public List<SearchModel> searchproduct(String name) {
		// TODO Auto-generated method stub
		return searchrepository.searchproduct(name);
	}

}
