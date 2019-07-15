package com.example.tinkoff.TinkoffProject.repository;

import com.example.tinkoff.TinkoffProject.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * CRUD repository for Result entity
 *
 * @date 18.09.2018
 *  */

@Repository
public interface ResultRepository extends JpaRepository<Result, String> {

}
