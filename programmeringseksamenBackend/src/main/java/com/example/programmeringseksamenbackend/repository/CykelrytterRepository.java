package com.example.programmeringseksamenbackend.repository;

import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CykelrytterRepository extends JpaRepository<Cykelrytter, Integer> {
}
