package com.demo.seoacount.repository;

import com.demo.seoacount.model.ListMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<ListMenu, Integer> {

}
