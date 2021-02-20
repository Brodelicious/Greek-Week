package com.TheBrodieBunch.GreekWeek.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TheBrodieBunch.GreekWeek.Beans.Group;

@Repository
public interface GroupDAO extends JpaRepository<Group, Integer>{
}
