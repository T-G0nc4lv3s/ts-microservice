package br.dev.tsantana.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.tsantana.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
