package online.zxb.cache.controller;

import online.zxb.cache.entity.Employee;
import online.zxb.cache.service.EmployeeService;
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
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        Employee emp = employeeService.getEmp(id);
        return emp;
    }
    @GetMapping("/emp")
    public Employee updateEmp(Employee employee){
        Employee emp = employeeService.update(employee);
        return emp;
    }

    @PostMapping("/emp/insert")
    public void insert(Employee employee){
        employeeService.insert(employee);
    }

    @GetMapping("/deleteEmp/{id}")
    public String delete(@PathVariable("id") Integer id){
        employeeService.deleteEmp(id);
        return "SUCCESS";
    }

    @GetMapping("/select/{lastName}")
    public Employee getByLastName(@PathVariable("lastName") String lastName){
        Employee employee = employeeService.getByLastName(lastName);
        return employee;
    }
}
