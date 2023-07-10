package com.dota2projectbackendspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dota2projectbackendspringboot.models.Torneo;

@Repository
public interface TorneoRepository extends JpaRepository<Torneo, Long> {
}
