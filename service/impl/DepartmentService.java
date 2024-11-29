package com.example.Spring.table.service.impl;

import com.example.Spring.table.entity.onetomany.Department;
import com.example.Spring.table.entity.onetomany.Members;
import com.example.Spring.table.repository.DepartmentRepository;
import com.example.Spring.table.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final MemberRepository memberRepository;

    // Save Department with Members
    public Department saveDepartment(Department department) {
        for (Members member : department.getMembers()) {
            member.setDepartment(department);  // Set the department for each member
        }
        return departmentRepository.save(department);
    }

    // Get all departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
