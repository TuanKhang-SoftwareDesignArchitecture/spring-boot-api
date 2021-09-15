package sv.iuh.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.iuh.springbootapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
