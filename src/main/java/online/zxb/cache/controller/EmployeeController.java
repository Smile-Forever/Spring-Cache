package online.zxb.cache.controller;

import online.zxb.cache.service.EmployeeService;
import online.zxb.cache.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName EmployeeController
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/29 16:00
 * @Version 1.0
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        Employee emp = employeeService.getEmp(id);
        return emp;
    }

    @PostMapping("/emp/insert")
    public void insert(Employee employee){
        employeeService.insert(employee);
    }
    @PutMapping("/emp/update")
    public void update(Employee employee){
        employeeService.update(employee);
    }
    @DeleteMapping("/emp/{id}")
    public void delete(@PathVariable("id") Integer id){
        employeeService.delete(id);
    }
}
