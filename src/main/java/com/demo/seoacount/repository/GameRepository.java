package com.demo.seoacount.repository;

import com.demo.seoacount.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

    @Modifying
    @Transactional
    @Query(value = "SELECT * from game g WHERE g.star = :star", nativeQuery = true)
    List<Game> findGoodGame(@Param("star") Integer star);

    @Modifying
    @Transactional
    @Query(value = "SELECT * from game g WHERE g.category_id = :category_id", nativeQuery = true)
    List<Game> findSlideGame(@Param("category_id") Integer category_id);

}
