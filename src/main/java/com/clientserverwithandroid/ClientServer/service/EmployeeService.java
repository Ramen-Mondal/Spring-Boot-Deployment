package com.clientserverwithandroid.ClientServer.service;

import com.clientserverwithandroid.ClientServer.dto.AddEmployeeRequestDto;
import com.clientserverwithandroid.ClientServer.dto.EmployeeDto;
import com.clientserverwithandroid.ClientServer.entity.Employee;

import java.util.List;


public interface EmployeeService {
    EmployeeDto addEmployeeDto(AddEmployeeRequestDto employee);
    void deleteEmployeeDtoById(Long id);
    List<EmployeeDto> getAllEmployeeDto();
}
