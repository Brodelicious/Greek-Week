package com.TheBrodieBunch.GreekWeek.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.TheBrodieBunch.GreekWeek.Services.GroupService;
import com.TheBrodieBunch.GreekWeek.Beans.Group;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RequestMapping(path = "/groups")
public class GroupController{
  private GroupService groupServ;

  @Autowired
  public GroupController(GroupService newGroupServ){
    groupServ = newGroupServ;
  }

  // Create
  @PostMapping
  public ResponseEntity<Integer> createGroup(@RequestBody Group group){
    return ResponseEntity.ok(groupServ.add(group));
  }
  
  // Read
  @GetMapping(path = "/{id}")
  public ResponseEntity<Group> getById(@PathVariable("id") Integer id){
    Group group = groupServ.getById(id);
    if(group != null){
      return ResponseEntity.ok(group);
    }
    else{
      return ResponseEntity.notFound().build();
    }
  }

  @GetMapping
  public ResponseEntity<List<Group>> getAll(){
    return ResponseEntity.ok(groupServ.getAll());
  }
  
  // Update
  @PutMapping
  public ResponseEntity<Void> update(@RequestBody Group group){
    if(groupServ.getById(group.getId()) != null){
      groupServ.update(group);
      return ResponseEntity.ok().build();
    }
    else{
      return ResponseEntity.notFound().build();
    }
  }

  // Delete
  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
    groupServ.delete(id);
    return ResponseEntity.ok().build();
  }

}
