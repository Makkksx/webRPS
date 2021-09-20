package com.task5.webRPS.repo;

import com.task5.webRPS.models.Move;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveRepository extends CrudRepository<Move, Long> {
    Iterable<Move> findAllByActiveTrue();
}
