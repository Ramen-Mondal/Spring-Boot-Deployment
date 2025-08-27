package com.clientserverwithandroid.ClientServer.repository;

import com.clientserverwithandroid.ClientServer.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
