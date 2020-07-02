package com.sdzee.db;

import java.sql.*;
import java.util.*;
import java.text.*;


public class AuthorDAO extends DAO<Author>{

	@Override
	public void Create(Author author) {
		// INSERTING OPERATION INTO THE TABLE
		try {
			String req = "INSERT (ID,NAME,DESCRIPTION INTO AUTHORS VALUES (?,?,?)";
			PreparedStatement PS = this.con.prepareStatement(req);
			PS.setInt(1, author.getId());
			PS.setString(2,author.getName());
			PS.setString(3,author.getDescription());
			PS.executeQuery();
		}
		catch(SQLException ex) {
			System.out.println("Problem when creating operation row ...");
		}
	}

	@Override
	public void Delete(Author obj) {
		try {
			String req = "DELETE FROM AUTHORS WHERE ID = ?";
			PreparedStatement PS = this.con.prepareStatement(req);
			PS.setInt(1, obj.getId());
			PS.executeQuery();
		}
		catch(SQLException ex) {
			System.out.println("Probleme when deleting operation row ...");
		}
		
	}

	@Override
	public Author Find(int id) {
		try {
			String req = "SELECT * FROM OPERATIONS WHERE ID = ?";
			PreparedStatement PS = this.con.prepareStatement(req);
			PS.setInt(1, id);
			ResultSet RS = PS.executeQuery();
		}
		catch(SQLException ex) {
			System.out.println("Probleme when Searching for Author row ...");
		}
		return null;
	}

	@Override
	public ArrayList<Author> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Author obj) {
		// TODO Auto-generated method stub
		
	}


}
