//package com.example.Spring.table.controller;
//
//
//
//import com.example.Spring.table.service.impl.AddresService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//    private final AddresService addresService;
//
//    // GET All Employees
//    @GetMapping("/api/learn/employee/relation")
//    public ResponseEntity<List<Employee>> getAllEmployees() {
//        List<Employee> employees = employeeService.getAllEmployees();
//        return ResponseEntity.ok(employees);
//    }
//
//    // POST Create Employee with Address
//    @PostMapping("/api/learn/table/relation")
//    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
//        Employee createdEmployee = employeeService.createEmployee(employee);
//        return ResponseEntity.ok(createdEmployee);
//    }
//
//
//    @PostMapping("/api/learn/address/relation")
//    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
//        Address saveAddress = addresService.saveAddress(address);
//        return ResponseEntity.ok(saveAddress);
//    }
//}
