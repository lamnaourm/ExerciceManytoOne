package com.ismo.dao;

import java.util.List;

public interface IDAO<T> {

	List<T> getAll();
	
	T getOne(int code);
	
	boolean save(T obj);
	
	boolean update(T obj);
	
	boolean delete(T obj);
}
