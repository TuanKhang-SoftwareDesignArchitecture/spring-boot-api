package sv.iuh.springbootapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.iuh.springbootapi.entity.Employee;
import sv.iuh.springbootapi.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/getall")
    public List<Employee> getAll(){
        return  employeeService.getAll();
    }
    @PostMapping("/addemployee")
    public void AddEm(Employee employee){
        employeeService.Add(employee);
    }
    @PutMapping("/updateemployee")
    public void Update(Employee employee){
        employeeService.Update(employee);
    }
    @DeleteMapping("/delete/{id")
    public void AddEm(@PathVariable("id") Long id){
        employeeService.Delete(id);
    }
}
