package com.sportivity.service;

import com.sportivity.model.Sport;
import com.sportivity.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by elena on 19/7/2017.
 */
@Service
@Transactional
public class SportServiceImpl implements SportService {

    @Qualifier("sportRepository")
    @Autowired
    private SportRepository sportRepository;

    public List<Sport> findByTitle(String title) {
        return sportRepository.findByTitle(title);
    }

    @Override
    public List<Sport> findAll() {
        return sportRepository.findAll();
    }


    @Override
    public void save(Sport sport) {
        sportRepository.save(sport);
    }

}
