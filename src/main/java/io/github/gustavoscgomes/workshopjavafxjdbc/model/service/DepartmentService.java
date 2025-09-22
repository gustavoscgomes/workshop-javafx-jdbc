package io.github.gustavoscgomes.workshopjavafxjdbc.model.service;

import io.github.gustavoscgomes.workshopjavafxjdbc.model.dao.DaoFactory;
import io.github.gustavoscgomes.workshopjavafxjdbc.model.dao.DepartmentDao;
import io.github.gustavoscgomes.workshopjavafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
