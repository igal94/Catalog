package com.example.Catalog.catalog;


import org.springframework.data.repository.CrudRepository;

public interface ItemDao extends CrudRepository<Item, String> {
}