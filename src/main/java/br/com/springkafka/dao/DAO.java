package br.com.springkafka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class DAO {

    protected Connection connection;
    protected PreparedStatement ps;
    protected ResultSet rs;
    protected String sql;

    protected String sql2;


}
