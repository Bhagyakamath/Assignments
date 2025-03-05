package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {
	public static void main(String args[]) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newDB", "root", "bhagya@30");
		Statement stmt=con.createStatement();
		//String sql="create table customer(id int, name varchar(50), price int, month varchar(50), year int, city varchar(50), category varchar(50), qty int) ";
		//String sql="insert into customer values(1,'John', 150, 'Jan', 2020, 'Chennai', 'Pen', 5), (2,'Bob', 100, 'Jan', 2020, 'Chennai', 'Book', 5), (3,'Alice', 300, 'Feb', 2021, 'Chennai', 'Laptop', 3), (4,'Dennis', 150, 'Feb', 2015, 'Hyderabad', 'Eraser', 10), (5,'Robert', 2000, 'March', 2018, 'Pune', 'Watch', 2)";
		//String sql="insert into customer values(6,'Kris', 15000, 'June', 2025, 'Delhi', 'Mobile', 1), (7,'Ram', 500, 'July', 2014, 'Chennai', 'Tshirt', 5), (8,'Nayana', 1000, 'June', 2021, 'Chennai', 'shoes', 3), (9,'Prajwal', 150, 'Dec', 2015, 'Hyderabad', 'Eraser', 10), (10,'Kavya', 2000, 'March', 2018, 'Pune', 'Watch', 2)";
		/*String sql="select * from customer";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getString(6)+" | "+rs.getString(7)+" | "+rs.getString(8));
		}*/
		//String sql="update customer set name='Radha' where id=5";
		String sql="delete from customer where id=10";
		
		stmt.execute(sql);
		System.out.println("Done");
	}

}
