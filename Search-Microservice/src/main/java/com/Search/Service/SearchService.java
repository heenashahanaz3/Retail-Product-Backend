package com.Search.Service;


import java.util.List;

import com.Search.Model.SearchModel;

public interface SearchService { 
	List<SearchModel> searchproduct(String name);
}
