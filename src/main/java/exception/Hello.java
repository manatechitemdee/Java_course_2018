package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.start();
    }

    private void start() {
        // TODO Auto-generated method stub
        UserDatabase userDatabase = new UserDatabase();
        try {
            userDatabase.getName(1);
        } catch (UserNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DatabaseProblemException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InternalInException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    class UserDatabase{
        public String getName(int id) throws UserNotFoundException, DatabaseProblemException, InternalInException {
            try {
                Class.forName("mysql.xxxx");
                Connection connection = DriverManager.getConnection("url");
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM TABLE");
                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next()) {
                    return resultSet.getString("NAME");
                }
                throw new UserNotFoundException();
            } catch (ClassNotFoundException e) {
                throw new InternalInException();
            } catch (SQLException e) {
                throw new DatabaseProblemException();
            }
        }
    }
}
