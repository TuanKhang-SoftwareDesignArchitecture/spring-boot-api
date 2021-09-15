package sv.iuh.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.iuh.springbootapi.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
