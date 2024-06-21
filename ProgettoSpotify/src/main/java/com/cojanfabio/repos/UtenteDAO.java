package com.cojanfabio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cojanfabio.enteties.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Long> {

}
