package iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeSalaryByDeptDTO {
    private String deptId;
    private String empId;
    private String empName;
    private double salary;
}