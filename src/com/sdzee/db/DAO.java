
package com.sdzee.db;
import java.sql.*;
import java.util.*;

public abstract class DAO <T>{
	protected Connection con;
	
	// ESTABLISHING THE CONNECTION WITH THE DATABASE
	DAO(){
		try {
			System.out.println("Loading the driver");
			Class.forName("com.mysql.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Bookstore", "root", "root");
			System.out.println("Connection Established");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Erreur lors du chargement du pilote");
		}
		catch(SQLException ex) {
			System.out.println("Erreur lors de la connexion a la bd");
		}
	}
	
	// Methods to manage data
	public abstract void Create(T obj);
	
	public abstract void Delete(T obj);
	
	public abstract T Find(int id);
	
	public abstract ArrayList<T> FindAll();
	
	public abstract void update(T obj);
	
}
