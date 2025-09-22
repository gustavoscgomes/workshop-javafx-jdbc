package io.github.gustavoscgomes.workshopjavafxjdbc.model.dao;

import io.github.gustavoscgomes.workshopjavafxjdbc.model.entities.Department;
import io.github.gustavoscgomes.workshopjavafxjdbc.model.entities.Seller;

import java.util.List;



public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
