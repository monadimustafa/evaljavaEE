package com.example.webappj2eetodos;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TodoDBUtil {
    private DataSource dataSource;
    private List<Todo> todoList;
    private Todo todo;

    public TodoDBUtil(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
    public List<Todo> getTodos() {
        Connection myConn;
        Statement myStmt;
        ResultSet myRs;
        try {
            myConn = dataSource.getConnection();
            String sql = "select * from todo";
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery(sql);
            todoList = new ArrayList<>();
            while (myRs.next()) {
                todo = new Todo(
                        myRs.getInt("id"),
                        myRs.getString("description"),
                        myRs.getInt("statut"));
                todoList.add(todo);
            }
            System.out.println(todoList);
            return todoList;
        } catch (Exception exc) {
            return null;
        }
    }

    public void updateTodo(int id) {
        Connection myConn=null;
        PreparedStatement myStmt = null;
        try {
            myConn = dataSource.getConnection();
            String sql = "update todo set statut = 1 where id=?";
            myStmt = myConn.prepareStatement(sql);
            myStmt.setInt(1, id);
            myStmt.execute();
        }
        catch(Exception e){System.out.println(e.getMessage());}
    }

}
