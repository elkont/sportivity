package com.sportivity.repository;

import com.sportivity.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by elena on 15/7/2017.
 */
    @Repository("sportRepository")
    public interface SportRepository extends CrudRepository<Sport, Long> {
    List<Sport> findAll();

    List<Sport> findByTitle(String title);

    }


