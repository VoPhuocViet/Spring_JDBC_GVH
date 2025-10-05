package iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.repositories;

import iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.entities.Employee;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    @Modifying
    @Query("INSERT INTO employee (emp_id, emp_name, email, age, status, dept_id, salary) " +
            "VALUES (:empId, :empName, :email, :age, :status, :deptId, :salary)")
    void insert(@Param("empId") String empId,
                @Param("empName") String empName,
                @Param("email") String email,
                @Param("age") int age,
                @Param("status") int status,
                @Param("deptId") String deptId,
                @Param("salary") double salary);

    List<Employee> findByEmpNameContainingIgnoreCase(String name);

    List<Employee> findByAge(int age);

    List<Employee> findBySalaryGreaterThanEqual(double salary);

    List<Employee> findByDeptId(String deptId);
}