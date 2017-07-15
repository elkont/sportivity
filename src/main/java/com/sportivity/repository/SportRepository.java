package com.sportivity.repository;

import com.sportivity.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by elena on 15/7/2017.
 */
public interface SportRepository {
    @Repository("sportRepository")
    public interface UserRepository extends JpaRepository<Sport, Long> {
        Sport findByTitle(String title);
    }

}
