package com.sdzee.db;

public class Author {
	protected int Id;
	protected String Name;
	protected String Description;
	
	
	// Setters and getters
	
	public int getId(){
		return this.Id;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public String getDescription(){
		return this.Description;
	}
	
	public void setId(int id){
		this.Id = id;
	}
	
	public void setName(String name){
		this.Name = name;
	}
	
	public void setDescription(String description){
		this.Description = description;
	}
}
