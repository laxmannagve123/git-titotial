package com.ecom.services;

import com.ecom.payload.ProductDto;
import com.ecom.payload.ProductResponse;

public interface ProductService {

	ProductDto createProduct(ProductDto product, int categoryId);

	ProductDto getProduct(int productId);

	ProductResponse getProductsByCategory(int categoryId, int pageNumber, int pageSize);

	void deleteProduct(int productId);

	ProductDto updateProduct(ProductDto newProduct, int pid);

	ProductResponse getAllProducts(int pageNumber, int pageSize, String sortBy, String sortDir);

}
