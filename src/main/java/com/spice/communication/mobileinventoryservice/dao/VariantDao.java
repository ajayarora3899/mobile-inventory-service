package com.spice.communication.mobileinventoryservice.dao;

import com.spice.communication.mobileinventoryservice.dao.model.Variant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantDao extends CrudRepository<Variant,Integer> {
}
