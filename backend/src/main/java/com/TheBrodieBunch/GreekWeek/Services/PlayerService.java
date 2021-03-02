package com.TheBrodieBunch.GreekWeek.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TheBrodieBunch.GreekWeek.DAOs.PlayerDAO;
import com.TheBrodieBunch.GreekWeek.Beans.Player;
import java.util.*;

@Service
public class PlayerService{
  private PlayerDAO playerDAO;

  @Autowired
  public PlayerService(PlayerDAO newPlayerDAO){
    playerDAO = newPlayerDAO;
  }

  // Create
  public Integer add(Player player){
    return playerDAO.save(player).getId();
  }
  
  // Read
  public Player getById(Integer id){
    return playerDAO.findById(id).get();
  }

  public List<Player> getAll(){
    return playerDAO.findAll();
  }
  
  // Update
  public void update(Player player){
    playerDAO.save(player);
  }
  
  // Delete
  public void delete(Integer id){
    playerDAO.deleteById(id);
  }
}
