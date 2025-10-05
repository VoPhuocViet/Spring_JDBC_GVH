package iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.services.impl;

import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.entities.Department;
import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.repositories.DepartmentRepository;
import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public Department create(Department department) {
        if (departmentRepository.existsById(department.getDeptId())) {
            throw new IllegalArgumentException("Department already exists: " + department.getDeptId());
        }
        departmentRepository.insert(department.getDeptId(), department.getDeptName());
        return department;
    }

    @Override
    public List<Department> getAll() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public Optional<Department> getById(String id) {
        return departmentRepository.findById(id);
    }

    @Override
    public Department update(Department department) {
        if (!departmentRepository.existsById(department.getDeptId())) {
            throw new IllegalArgumentException("Department not found: " + department.getDeptId());
        }
        return departmentRepository.save(department);
    }

    @Override
    public void delete(String id) {
        departmentRepository.deleteById(id);
    }
}
