package com.entity;

public class Ipl {
private int id ;
private String name;
private String city;
private String state;
public Ipl()
{
}
public Ipl(int id,String name, String city, String state) {
	super();
	this.id=id;
	this.name = name;
	this.city = city;
	this.state = state;
}
public String getName() {
	return name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Ipl [id="+id+",name=" + name + ", city=" + city + ", state=" + state + "]";
}

}
