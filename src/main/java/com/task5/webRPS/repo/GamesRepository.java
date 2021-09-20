package com.task5.webRPS.repo;

import com.task5.webRPS.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends CrudRepository<Game, Long> {
}
