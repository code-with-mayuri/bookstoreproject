package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.entity.Ipl;

public interface IplDao {
public List<Ipl>findAll() throws ClassNotFoundException, SQLException;
public void insertipl(Ipl i) throws ClassNotFoundException, SQLException;
public void updateipl(Ipl i) throws ClassNotFoundException,SQLException;
public void deleteipl(Ipl i) throws ClassNotFoundException,SQLException;



}
