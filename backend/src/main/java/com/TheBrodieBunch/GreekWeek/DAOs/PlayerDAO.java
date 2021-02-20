package com.TheBrodieBunch.GreekWeek.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TheBrodieBunch.GreekWeek.Beans.Player;

@Repository
public interface PlayerDAO extends JpaRepository<Player, Integer>{
}
