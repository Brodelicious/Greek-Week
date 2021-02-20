package com.TheBrodieBunch.GreekWeek.Beans;


public class Player{
  private Integer id;
  private String name;
  private Integer groupId;

  public Player(){
    id = -1;
    name  = "";
    groupId = -1;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getGroupId() {
    return groupId;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    if (!super.equals(object)) return false;

    Player player = (Player) object;

    if (id != null ? !id.equals(player.id) : player.id != null) return false;
    if (name != null ? !name.equals(player.name) : player.name != null) return false;
    if (groupId != null ? !groupId.equals(player.groupId) : player.groupId != null) return false;

    return true;
  }

  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
    return result;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Player{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", groupId=" + groupId +
            '}';
  }
}
