package iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.services;

import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.entities.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Department create(Department department);

    List<Department> getAll();

    Optional<Department> getById(String id);

    Department update(Department department);

    void delete(String id);
}
