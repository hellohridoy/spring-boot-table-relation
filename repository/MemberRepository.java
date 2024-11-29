package com.example.Spring.table.repository;

import com.example.Spring.table.entity.onetomany.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Department, Long> {
}
