//package com.example.Spring.table.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "addresses")
//public class Address {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String street;
//
//    @Column(nullable = false)
//    private String city;
//
//    @Column(nullable = false)
//    private String state;
//
//    @Column(nullable = false)
//    private String country;
//
//    @Column(nullable = false)
//    private String zipCode;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "employees_id")
//    private Employee employee;
//}
