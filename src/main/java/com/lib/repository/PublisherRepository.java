package com.lib.repository;

import com.lib.entity.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Integer> {
}
