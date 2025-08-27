package com.clientserverwithandroid.ClientServer.service.impl;

import com.clientserverwithandroid.ClientServer.dto.AddEmployeeRequestDto;
import com.clientserverwithandroid.ClientServer.dto.EmployeeDto;
import com.clientserverwithandroid.ClientServer.entity.Employee;
import com.clientserverwithandroid.ClientServer.repository.EmployeeRepository;
import com.clientserverwithandroid.ClientServer.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public EmployeeDto addEmployeeDto(AddEmployeeRequestDto addEmployeeRequestDto){
        Employee employee = modelMapper.map(addEmployeeRequestDto,Employee.class);
        Employee saveEmployee = employeeRepository.save(employee);
        return modelMapper.map(saveEmployee,EmployeeDto.class);
    }

    @Override
    public void deleteEmployeeDtoById(Long id){
        if(!employeeRepository.existsById(id)){
            throw new IllegalArgumentException("User not in the DataBase");
        }
        employeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeDto> getAllEmployeeDto(){
        List<Employee> employeesList= employeeRepository.findAll();
        return employeesList
                .stream()
                .map(employee -> modelMapper.map(employee,EmployeeDto.class))
                .toList();

    }

}
