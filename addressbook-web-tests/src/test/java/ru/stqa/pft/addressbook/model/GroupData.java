package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupData {
  private final String header;
  private final String footer;

  public void setId(int id) {
    this.id = id;
  }

  private final String name;
  private int id;

  public GroupData(String name, String header, String footer) {
    this.header = header;
    this.footer = footer;
    this.name = name;
    this.id = 0;
  }



  public GroupData(int id, String name, String header, String footer) {
    this.header = header;
    this.footer = footer;
    this.name = name;
    this.id = id;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GroupData groupData = (GroupData) o;
    return id == groupData.id && Objects.equals(name, groupData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public String toString() {
    return "GroupData{" +
            "header='" + header + '\'' +
            ", id='" + id + '\'' +
            '}';
  }

}
