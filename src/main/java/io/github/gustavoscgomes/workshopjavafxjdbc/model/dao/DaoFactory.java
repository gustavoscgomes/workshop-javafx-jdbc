package io.github.gustavoscgomes.workshopjavafxjdbc.model.dao;


import io.github.gustavoscgomes.workshopjavafxjdbc.db.DB;
import io.github.gustavoscgomes.workshopjavafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import io.github.gustavoscgomes.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC;


public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
