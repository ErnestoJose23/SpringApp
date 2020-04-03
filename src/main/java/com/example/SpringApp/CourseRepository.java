package com.example.SpringApp;

import java.math.BigInteger;

import com.fasterxml.jackson.databind.node.BigIntegerNode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, BigInteger> {
}
