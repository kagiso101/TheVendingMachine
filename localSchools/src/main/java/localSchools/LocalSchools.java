package localSchools;

import java.util.*;
import java.sql.*;

import com.github.javafaker.Faker;

public class LocalSchools {


    public static void main(String[] args) {

        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:students.db");
            Statement statement = connection.createStatement();
            String addToDataBase = "INSERT INTO STUDENTS (firstName, lastName) VALUES (?,?)";


            statement.executeUpdate("drop table if exists students");
            statement.executeUpdate("create table students (id integer primary key, firstName string ,lastName )");
            ResultSet rs = statement.executeQuery("select * from students");

            PreparedStatement preparedStatement = connection.prepareStatement(addToDataBase);

            for(int i = 0; i < 100 ;i++ ) {

                Faker faker = new Faker();

                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();


                preparedStatement.setString(1, firstName);
                preparedStatement.setString(2, lastName);

                System.out.println("full Name :" + firstName + " " + lastName);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }



//
//    Faker faker = new Faker();
//    String name = faker.name().fullName();
//    String firstName = faker.name().firstName();
//    String lastName = faker.name().lastName();



}
