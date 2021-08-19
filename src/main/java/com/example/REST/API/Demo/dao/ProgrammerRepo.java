package com.example.REST.API.Demo.dao;

import com.example.REST.API.Demo.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {
}
