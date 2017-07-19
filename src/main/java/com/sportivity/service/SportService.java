package com.sportivity.service;

import com.sportivity.model.Sport;

import java.util.List;

/**
 * Created by elena on 19/7/2017.
 */
public interface SportService {
    List<Sport> findAll();
    List<Sport> findByTitle(String title);

    void save(Sport sport);
}
