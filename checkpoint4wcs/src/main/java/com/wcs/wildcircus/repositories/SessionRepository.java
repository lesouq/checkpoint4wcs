package com.wcs.wildcircus.repositories;

import com.wcs.wildcircus.entities.Session;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}