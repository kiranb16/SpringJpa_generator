package com.codemind.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemind.model.Laptop;

public interface Laptoprepository extends JpaRepository<Laptop, Integer> {

}
