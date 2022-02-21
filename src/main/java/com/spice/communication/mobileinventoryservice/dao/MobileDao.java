package com.spice.communication.mobileinventoryservice.dao;

import com.spice.communication.mobileinventoryservice.dao.model.Brand;
import com.spice.communication.mobileinventoryservice.dao.model.Mobile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileDao extends CrudRepository<Mobile,Integer> {

    List<Mobile> findAll();

    @Query("select mob from Mobile mob where mob.brand.id=?1")
    List<Mobile> findAllByBrandId(Integer bid);
}

