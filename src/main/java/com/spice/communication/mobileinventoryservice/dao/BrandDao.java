package com.spice.communication.mobileinventoryservice.dao;

import com.spice.communication.mobileinventoryservice.dao.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandDao extends CrudRepository<Brand,Integer> {

    List<Brand> findAll();

}
