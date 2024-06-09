package com.devayani.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devayani.fullstackbackend.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
