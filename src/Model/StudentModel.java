/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Students;
import SqlConnection.ConnectionHelper;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class StudentModel {
    public ArrayList<Students> getListStudents(){
        ArrayList<Students> listStudents = new ArrayList<>();
        Connection connection = ConnectionHelper.getConnection();
        if (connection == null){
            return listStudents;
        }
        
        String query = "SELECT * FROM students";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt("id");
                String rollNumber = rs.getString("rollNumber");
                String name = rs.getString("name");
                int gender = rs.getInt("gender");
                String birthday = rs.getString("birthday");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                int status = rs.getInt("status");
                
                
                Students students = new Students(id, rollNumber, name, gender, birthday, phone, email, address, status);
                listStudents.add(students);
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStudents;
    }
    
    public Students addStudent(String rollNumber, String name, int gender, String birthday,
            String email, String phone, String address, String createAt, int status) throws SQLException{
        Connection connection = ConnectionHelper.getConnection();
        if (connection == null) {
            return null;
        }
        StringBuilder insertQuery = new StringBuilder("INSERT INTO students(rollNumber, name, gender, birthday, email, phone, address, createAt, status) VALUE ('");
        insertQuery.append(rollNumber); insertQuery.append("','");
        insertQuery.append(name); insertQuery.append("','");
        insertQuery.append(gender); insertQuery.append("','");
        insertQuery.append(birthday); insertQuery.append("','");
        insertQuery.append(email); insertQuery.append("','");
        insertQuery.append(phone); insertQuery.append("','");
        insertQuery.append(address); insertQuery.append("','");
        insertQuery.append(createAt); insertQuery.append("','");
        insertQuery.append(status); insertQuery.append("')");
        
        Statement statement = connection.createStatement();
        statement.executeUpdate(insertQuery.toString());
        
        
        System.out.println("STUDENT ADDED SUCCESSFULLY !!");
        
        return null;
    }
    public Students deleteStudent(String rollNumber) throws SQLException{
        Connection connection = ConnectionHelper.getConnection();
        if (connection == null) {
            return null;
        }   
        StringBuilder deleteQuery = new StringBuilder("DELETE FROM students WHERE rollNumber='");
        deleteQuery.append(rollNumber);deleteQuery.append("'");
        Statement statement = connection.createStatement();
        statement.executeUpdate(deleteQuery.toString());
        System.out.println("STUDENT DELETED SUCCESSFULLY !!");
        
        return null;
    }
    
}
