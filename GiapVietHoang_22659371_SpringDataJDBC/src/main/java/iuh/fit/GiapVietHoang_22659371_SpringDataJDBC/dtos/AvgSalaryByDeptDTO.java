package iuh.fit.GiapVietHoang_22659371_SpringDataJDBC.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvgSalaryByDeptDTO {
    private String deptId;
    private int count;
    private double avgSalary;
}