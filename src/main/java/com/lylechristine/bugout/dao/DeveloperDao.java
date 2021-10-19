package com.lylechristine.bugout.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lylechristine.bugout.entity.DeveloperEntity;

@Repository
public interface DeveloperDao extends JpaRepository<DeveloperEntity, Integer> {

}
