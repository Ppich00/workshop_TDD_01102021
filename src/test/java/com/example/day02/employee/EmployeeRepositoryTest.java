package com.example.day02.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void case01() {
        //arrange
        Employee demo = new Employee("pichayuth");
        employeeRepository.save(demo);
        //act
        Optional<Employee> result = employeeRepository.findById(1);

        //assert
        assertTrue(result.isPresent());
        assertEquals(1, result.get().getId());
        assertEquals("pichayuth", result.get().getName());

    }
}