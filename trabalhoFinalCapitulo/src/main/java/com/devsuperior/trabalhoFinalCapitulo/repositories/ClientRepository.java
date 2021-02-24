package com.devsuperior.trabalhoFinalCapitulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.trabalhoFinalCapitulo.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
