package com.jpa.springjpa.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChessPlayerRepo extends JpaRepository<ChessPlayer,Long> {
    @Query(nativeQuery = true)
    List<PlayerNameDto> findPlayerNameDtoById_Named();
}
