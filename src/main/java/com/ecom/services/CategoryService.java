package com.ecom.services;

import java.util.List;

import com.ecom.payload.CategoryDto;

public interface CategoryService {

	CategoryDto create(CategoryDto caDto);

	CategoryDto get(int catId);

	List<CategoryDto> get();

	void delete(int catId);

	CategoryDto update(CategoryDto caDto, int catId);

}
