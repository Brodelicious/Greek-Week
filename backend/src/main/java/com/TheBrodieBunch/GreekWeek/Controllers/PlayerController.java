package com.TheBrodieBunch.GreekWeek.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.TheBrodieBunch.GreekWeek.Services.PlayerService;
import org.springframework.web.bind.annotation.*;
import com.TheBrodieBunch.GreekWeek.Beans.Player;

import java.util.List;


@RestController
@CrossOrigin(origins="http://localhost:4200", allowCredentials="true")
@RequestMapping(path="/players")
public class PlayerController{
  private PlayerService playerServ;

  @Autowired
  public PlayerController(PlayerService newPlayerServ){
    playerServ = newPlayerServ;
  }

  // Create
  @PostMapping
  public ResponseEntity<Integer> add(@RequestBody Player player){
    return ResponseEntity.ok(playerServ.add(player));
  }
  
  // Read
  @GetMapping
  public ResponseEntity<List<Player>> getAll(){
    return ResponseEntity.ok(playerServ.getAll());
  }

  @GetMapping(path="/{id}")
  public ResponseEntity<Player> getById(@PathVariable("id") Integer id){
    return ResponseEntity.ok(playerServ.getById(id));
  }
  
  // Update
  @PutMapping
  public ResponseEntity<Void> update(@RequestBody Player player){
    playerServ.update(player);
    return ResponseEntity.ok().build();
  }
  
  // Delete
  @DeleteMapping(path="/{id}")
  public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
    playerServ.delete(id);
    return ResponseEntity.ok().build();
  }

}
