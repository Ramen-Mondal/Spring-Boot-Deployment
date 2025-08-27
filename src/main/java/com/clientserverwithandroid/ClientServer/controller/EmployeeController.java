package com.clientserverwithandroid.ClientServer.controller;

import com.clientserverwithandroid.ClientServer.dto.AddEmployeeRequestDto;
import com.clientserverwithandroid.ClientServer.dto.EmployeeDto;
import com.clientserverwithandroid.ClientServer.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/employee/get-all")
    public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployeeDto());
    }
    @PostMapping("/employee/add")
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody AddEmployeeRequestDto addEmployeeRequestDto){
       EmployeeDto employeeDto = employeeService.addEmployeeDto(addEmployeeRequestDto);
        return ResponseEntity.ok(employeeDto);
    }

}
