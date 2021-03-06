package com.ordermanagement.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ordermanagement.app.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
