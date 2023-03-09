package com.IplDaoImplement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.IplDao;
import com.entity.Ipl;

public class IplDaoImplement implements IplDao {

	@Override
	public List<Ipl> findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ArrayList<Ipl> list= new ArrayList<Ipl>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydata","root","root");
		PreparedStatement st=con.prepareStatement("select * from IPL");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
		Ipl e=new Ipl();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setCity(rs.getString(3));
		e.setState(rs.getString(4));
		list.add(e);
		}
		return list;
	}
		
		
	
	@Override
	public void insertipl(Ipl i) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydata","root","root");
		PreparedStatement st=con.prepareStatement("insert into IPL values(?,?,?,?)");
		st.setInt(1, i.getId());
		st.setString(2, i.getName());
		st.setString(3, i.getCity());
		st.setString(4, i.getState());
		st.executeUpdate();
		con.close();
		
	}

	@Override
	public void updateipl(Ipl i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydata","root","root");
		PreparedStatement st=con.prepareStatement("update IPL set name=?,city=?,state=?where id=?");
		
		st.setString(1, i.getName());
		st.setString(2, i.getCity());
		st.setString(3, i.getState());
		st.setInt(4,i.getId());
		
		st.executeUpdate();
		con.close();
		
	}

	@Override
	public void deleteipl(Ipl i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydata","root","root");
		PreparedStatement st=con.prepareStatement("delete  from IPL where id=?");
		
		
		st.setInt(1,i.getId());
		
		st.executeUpdate();
		con.close();
	}

}
