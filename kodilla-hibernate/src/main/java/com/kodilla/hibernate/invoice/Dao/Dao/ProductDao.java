package com.kodilla.hibernate.invoice.Dao.Dao;

import com.kodilla.hibernate.invoice.Dao.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
}
