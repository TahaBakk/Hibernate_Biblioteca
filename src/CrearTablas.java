import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by x3727349s on 16/01/17.
 */
public class CrearTablas {

    public void crearTablas() {

        Connection c = null;
        Statement stmt = null;

        try {
            //Class.forName("org.sqlite.JDBC");
            //c = DriverManager.getConnection("jdbc:sqlite:movies.db");
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://172.31.73.167:5432/postgres","taha", "taha");

            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE Llibres " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " TITOL CHAR(50) PRIMARY KEY NOT NULL," +
                    " NOMBRE_DEXEMPLARS INT NOT NULL," +
                    " EDITORIAL CHAR(50) NOT NULL," +
                    " NOMBRE_PAGINES INT NOT NULL," +
                    " ANY_DEDICIO INT NOT NULL");

            String sql2 = "CREATE TABLE SOCIS " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NOM        INT   NOT NULL, " +
                    " COGNOM       CHAR(25)   NOT NULL, " +
                    " DIRRECIO       CHAR(50) NOT NULL, " +
                    " TELEFON       INT   NOT NULL, " +
                    " EDAT        INT   NOT NULL) ";

            String sql3 = "CREATE TABLE PRESTEC " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           CHAR(50)    NOT NULL, " +
                    " DATE_OF_BIRTHDAY          TEXT     NOT NULL) ";

            stmt.executeUpdate(sql);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);

            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

}


