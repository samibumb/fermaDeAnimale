package org.fasttrackit.ferma.jdbc.repository;

import org.fasttrackit.ferma.domain.Animal;

import java.sql.*;

public class AnimalRepository {
    private final static String url= "jdbc:mysql://localhost:3306/world";
    private final static String user="root";
    private final static String password="Material1!";

    public static Animal getAnimalByID(long id){
       try {
           Connection connection = DriverManager.getConnection(url,user,password);

           Statement statement = connection.createStatement();

           ResultSet resultSet = statement.executeQuery("Select * from animal where id ="+id);
            while (resultSet.next()){
                System.out.println(resultSet.getString("id")+". "+resultSet.getString("animal_type")+
                        " "+resultSet.getString("age"));
            }

            resultSet.close();
            statement.close();
            connection.close();

       }catch (Exception e){
           e.printStackTrace();
       }
       return null;
    }

    public static void main(String[] args){
        System.out.println("Animal table from MySQL :\nID/Animal/Age");
        getAnimalByID(1);
    }
}
