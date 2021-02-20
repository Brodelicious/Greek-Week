package com.TheBrodieBunch.GreekWeek.Beans;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Group{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private Integer points;

  public Group(){
    id = -1;
    name = "";
    points = 0;
 }
  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getPoints() {
    return points;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    if (!super.equals(object)) return false;

    Group group = (Group) object;

    if (id != null ? !id.equals(group.id) : group.id != null) return false;
    if (name != null ? !name.equals(group.name) : group.name != null) return false;
    if (points != null ? !points.equals(group.points) : group.points != null) return false;

    return true;
  }

  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (points != null ? points.hashCode() : 0);
    return result;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Group{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", points=" + points +
            '}';
  }
}
