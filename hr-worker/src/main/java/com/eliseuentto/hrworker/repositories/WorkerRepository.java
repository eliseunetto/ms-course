package com.eliseuentto.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eliseuentto.hrworker.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,	Long> {

}
