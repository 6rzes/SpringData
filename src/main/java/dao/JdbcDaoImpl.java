package dao;

import Model.Circle;

import java.sql.*;

/**
 * Created by Grzes on 2016-02-08.
 */
public class JdbcDaoImpl {

    public Circle getCircle(int circleId) {

        String driver = "org.postgrsql.Driver";
        PreparedStatement ps = null;
        Circle circle = null;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

            Connection connection = null;

            try {
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");


                System.out.println("haklo");
                ps = connection.prepareStatement("SELECT * FROM circle Where id=1");
                System.out.println("haklo");

                //ps.setInt(1, circleId);
                ResultSet result = ps.executeQuery();

                System.out.println("result: "+ result.toString());

                if (result.next())
                    circle = new Circle(circleId, result.toString());


            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        finally {
                connection.close();
                ps.close();
                result.close();

            }




        return circle;
        }


    }
