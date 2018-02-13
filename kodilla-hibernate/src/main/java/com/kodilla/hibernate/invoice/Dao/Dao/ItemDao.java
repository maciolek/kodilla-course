package com.kodilla.hibernate.invoice.Dao.Dao;

import com.kodilla.hibernate.invoice.Dao.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item,Integer> {
}
