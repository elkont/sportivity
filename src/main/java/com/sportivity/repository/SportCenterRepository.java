package com.sportivity.repository;

import com.sportivity.model.SportCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by elena on 16/7/2017.
 */
@Repository("sportCenterRepository")
public interface SportCenterRepository extends JpaRepository<SportCenter, Long> {

    List<SportCenter> findByLocation(String location);

}
