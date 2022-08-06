package com.ecom.services;

import com.ecom.payload.CartDto;
import com.ecom.payload.ItemRequest;

public interface CartService {

	CartDto addItem(ItemRequest reqeust, String userName);

}
