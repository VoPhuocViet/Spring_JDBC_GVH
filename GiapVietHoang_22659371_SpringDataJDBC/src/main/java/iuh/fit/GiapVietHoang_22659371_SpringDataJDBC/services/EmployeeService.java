package iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.services;

import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.dtos.AvgSalaryByDeptDTO;
import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.dtos.AvgSalaryByStatusDTO;
import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.dtos.DepartmentWithEmployeesDTO;
import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.dtos.EmployeeSalaryByDeptDTO;
import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.entities.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeService {
    Employee create(Employee employee);

    List<Employee> getAll();

    Optional<Employee> getById(String id);

    Employee update(Employee employee);

    void delete(String id);

    List<Employee> searchByName(String name);

    List<Employee> searchByAge(int age);

    List<Employee> searchBySalary(double salary);

    List<Employee> getEmployeesByDepartment(String deptId);

    List<Employee> findEmployeesWithMaxSalary();

    List<Employee> findEmployeesWithMaxAge();

    List<AvgSalaryByDeptDTO> getEmployeeCountAndAvgSalaryByDepartment();

    List<AvgSalaryByStatusDTO> getEmployeeCountAndAvgSalaryByStatus();

    List<DepartmentWithEmployeesDTO> getEmployeesSortedBySalaryPerDepartment();
}
