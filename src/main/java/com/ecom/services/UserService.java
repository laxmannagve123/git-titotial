package com.ecom.services;

import javax.validation.Valid;

import com.ecom.payload.UserDto;

public interface UserService {

	UserDto create(@Valid UserDto userDto);

}
