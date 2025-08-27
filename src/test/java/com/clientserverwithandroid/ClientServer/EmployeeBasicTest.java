package com.clientserverwithandroid.ClientServer;

import com.clientserverwithandroid.ClientServer.dto.AddEmployeeRequestDto;
import com.clientserverwithandroid.ClientServer.dto.EmployeeDto;
import com.clientserverwithandroid.ClientServer.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EmployeeBasicTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void simpleAddingTest(){
        AddEmployeeRequestDto employeeDto = AddEmployeeRequestDto.builder()
                .name("Sham Roy")
                .location("Kolkata")
                .branch("Brasat")
                .build();

//        employeeService.addEmployeeDto(employeeDto);
//        employeeService.deleteEmployeeDtoById(7L);
//        List<EmployeeDto> employeeDtoList= employeeService.getAllEmployeeDto();
//
//        for(EmployeeDto e: employeeDtoList){
//            System.out.println(e.getId());
//            System.out.println(e.getName());
//            System.out.println(e.getLocation());
//            System.out.println(e.getBranch());
//        }

    }

}
