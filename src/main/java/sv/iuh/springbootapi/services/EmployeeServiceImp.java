package sv.iuh.springbootapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import sv.iuh.springbootapi.entity.Employee;
import sv.iuh.springbootapi.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void Add(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void Delete(Long id) {
        Employee e= employeeRepository.getById(id);
        employeeRepository.delete(e);
    }

    @Override
    public void Update(Employee employee) {
        employeeRepository.save(employee);
    }
}
