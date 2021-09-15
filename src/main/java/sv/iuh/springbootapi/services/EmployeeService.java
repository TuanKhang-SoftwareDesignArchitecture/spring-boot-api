package sv.iuh.springbootapi.services;

import org.springframework.stereotype.Service;
import sv.iuh.springbootapi.entity.Employee;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAll();
    void Add(Employee employee);
    void Delete(Long id);
    void Update(Employee employee);
}
