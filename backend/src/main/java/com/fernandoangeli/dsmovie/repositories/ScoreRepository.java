package com.fernandoangeli.dsmovie.repositories;

import com.fernandoangeli.dsmovie.entities.Score;
import com.fernandoangeli.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
