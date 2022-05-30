package com.example.programmeringseksamenbackend.repository;

import com.example.programmeringseksamenbackend.entity.Cykelhold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CykelholdRepository extends JpaRepository<Cykelhold, String> {

}
