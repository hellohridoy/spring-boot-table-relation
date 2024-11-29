//package com.example.Spring.table.controller;
//
//
//
//import com.example.Spring.table.service.impl.AddresService;
//import com.example.Spring.table.service.impl.EmployeeService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class AddressControlar {
//
//    private final EmployeeService employeeService;
//    private final AddresService addresService;
//
//    // POST method to create a new Address
//    @PostMapping("/api/learn/table/address")
//    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
//        Address createdAddress = addresService.saveAddress(address);
//        return new ResponseEntity<>(createdAddress, HttpStatus.CREATED);
//    }
//
//    // GET method to retrieve all addresses
//    @GetMapping("/api/learn/table/address")
//    public ResponseEntity<List<Address>> getAllAddresses() {
//        List<Address> addresses = addresService.getAllAddresses();
//        return new ResponseEntity<>(addresses, HttpStatus.OK);
//    }
//
//}
