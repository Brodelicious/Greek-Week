package com.TheBrodieBunch.GreekWeek.Services;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TheBrodieBunch.GreekWeek.DAOs.GroupDAO;
import com.TheBrodieBunch.GreekWeek.Beans.Group;

@Service
public class GroupService{
  private GroupDAO groupDAO;
  private List<String> letters = new ArrayList<String>( Arrays.asList(
        "Alpha",
        "Beta",
        "Gamma",
        "Delta",
        "Epsilon",
        "Zeta",
        "Eta",
        "Theta",
        "Iota",
        "Kappa",
        "Lamda",
        "Mu",
        "Nu",
        "Xi",
        "Omicron",
        "Pi",
        "Rho",
        "Sigma",
        "Tau",
        "Upsilon",
        "Phi",
        "Chi",
        "Psi",
        "Omega"
      ));

  @Autowired
  public GroupService(GroupDAO newGroupDAO){
    groupDAO = newGroupDAO;
  }

  public String generateName(){
    String name;
    Random random = new Random();
    String letter_one = letters.get(random.nextInt(24));
    String letter_two = letters.get(random.nextInt(24));
    String letter_three = letters.get(random.nextInt(24));

    return letter_one + " " + letter_two + " " + letter_three;
  }
   
  // Create
  public Integer create(Group group){
    return groupDAO.save(group).getId();
  }

  // Read
  public Group getById(Integer id){
    return groupDAO.findById(id).get();
  }

  public List<Group> getAll(){
    return groupDAO.findAll();
  }

  // Update
  public void update(Group group){
    groupDAO.save(group);
  }

  // Delete
  public void delete(Integer id){
    groupDAO.deleteById(id);
  }

}
