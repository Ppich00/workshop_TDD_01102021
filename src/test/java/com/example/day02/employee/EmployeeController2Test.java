package com.example.day02.employee;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeController2Test {
    @MockBean
    private EmployeeRepository employeeRepository;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void getById() {
        Employee employee = new Employee();
        employee.setId(100);
        employee.setName("Pui");
        when(employeeRepository.findById(100)).thenReturn(Optional.of(employee));

        EmployeeResponse result = restTemplate.getForObject("/employee/100", EmployeeResponse.class);

        assertEquals(100, result.getId());
        assertEquals("Pui", result.getName());
    }

}