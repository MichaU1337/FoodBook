package foodbook;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class JDBC {
  
    private static String daneZBazy;
    private String address;
    private String login;
    private String haslo;
    private String port;
    
    private Connection conn = null;
    
    static List<SingleRecipe> DBList = RecipeIO.getRecipeList();

    public void testConnection() throws SQLException, ClassNotFoundException{
        // Connect to przepisy database...
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/przepisy?useSSL=false","root", "komputer");
        
        //Ustawiamy sterownik MySQL
        Class.forName("com.mysql.jdbc.Driver");
        
        // Check if the folder exist               
        String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'przepisy' AND table_name = 'przepisy';";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        // If it does...
        if(rs.next()){
            // Show message
            JOptionPane.showMessageDialog(null, "Connection established succesfully");            
        }
        else JOptionPane.showMessageDialog(null, "Connection terminated");     
    }
    
    public void saveToDatabase(String address,String port, String login, String haslo){
        this.address = "localhost";
        this.port = String.valueOf(3306);
        this.login = login;
        this.haslo = haslo;               
        
        String connectionURL = String.format("jdbc:mysql://%s:%s/przepisy?useSSL=false", this.address, this.port);
        try {
            //Ustawiamy dane dotyczące podłączenia                    
            conn = DriverManager.getConnection(connectionURL, login, haslo);

            //Ustawiamy sterownik MySQL
            Class.forName("com.mysql.jdbc.Driver");               
                
            // Check if the folder exist               
            String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'przepisy' AND table_name = 'przepisy';";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        
            // If it does...
            if(rs.next()){
                // Drop table "Przepisy"...
                String query1 = "drop table przepisy";               
                stmt.executeUpdate(query1);
            }
        
            for(SingleRecipe s : DBList){
                System.out.println(s.getName());
            }
            // Create przepisy in the DB...
            String query2 = "create table przepisy(nazwa varchar(40), opis varchar(40))";
            stmt.executeUpdate(query2);
        
            // Copy recipes to the DB...
            for(SingleRecipe s : DBList){
                String queryInsert = String.format("insert into przepisy values('%s','%s')", s.getName(), s.getDescription());
                stmt.executeUpdate(queryInsert);
            }
        
        
            conn.close();               
            } 
        //Wyrzuć wyjątki jężeli nastąpią błędy z podłączeniem do bazy danych lub blędy zapytania o dane
        catch(ClassNotFoundException wyjatek) {
                System.out.println("Problem ze sterownikiem");
        }

        catch(SQLException wyjatek) {
            System.out.println("Problem z logowaniem\nProsze sprawdzic:\n nazwę użytkownika, hasło, nazwę bazy danych lub adres IP serwera");
            System.out.println("SQLException: " + wyjatek.getMessage());
            System.out.println("SQLState: " + wyjatek.getSQLState());
            System.out.println("VendorError: " + wyjatek.getErrorCode());
        }
    }
    
    public void loadFromDatabase(String address,String port, String login, String haslo){
        this.address = "localhost";
        this.port = String.valueOf(3306);
        this.login = login;
        this.haslo = haslo;               
        
        String connectionURL = String.format("jdbc:mysql://%s:%s/przepisy?useSSL=false", this.address, this.port);
        try {
            //Ustawiamy dane dotyczące podłączenia                    
            conn = DriverManager.getConnection(connectionURL, login, haslo);

            //Ustawiamy sterownik MySQL
            Class.forName("com.mysql.jdbc.Driver");               
                
            // Check if the folder exist               
            String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'przepisy' AND table_name = 'przepisy';";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
 
            // If it does...
            if(rs.next()){
                String query1 = "Select * FROM przepisy";
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(query1);  
                
                while (result.next()) {                    
                    String recipeName = result.getString(1);
                    String recipeDesc = result.getString(2);
                
                    DBList.add(new SingleRecipe(recipeName, recipeDesc));
                } 
            }
            // Override old recipe list with the new, just loaded...
            if(!RecipeIO.getRecipeList().isEmpty()){
                RecipeIO.clearRecipeList();
            }
            RecipeIO.clearRecipeList();
            RecipeIO.saveRecipeList(DBList);

            conn.close();               
            } 
        //Wyrzuć wyjątki jężeli nastąpią błędy z podłączeniem do bazy danych lub blędy zapytania o dane
        catch(ClassNotFoundException wyjatek) {
                System.out.println("Problem ze sterownikiem");
        }

        catch(SQLException wyjatek) {
            System.out.println("Problem z logowaniem\nProsze sprawdzic:\n nazwę użytkownika, hasło, nazwę bazy danych lub adres IP serwera");
            System.out.println("SQLException: " + wyjatek.getMessage());
            System.out.println("SQLState: " + wyjatek.getSQLState());
            System.out.println("VendorError: " + wyjatek.getErrorCode());
        }
    }
    
    
//    public static void main(String[] args) {
//        
//            //Tworzymy proste zapytanie doa bazy danych
//            String query = "Select * FROM user";
//
//            Connection conn = null;
//
//            try {
//
//                    //Ustawiamy dane dotyczące podłączenia
//                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin?useSSL=false","root", "komputer");
//
//                    //Ustawiamy sterownik MySQL
//                    Class.forName("com.mysql.jdbc.Driver");
//
//                    //Uruchamiamy zapytanie do bazy danych
//                    Statement stmt = conn.createStatement();
//                    ResultSet rs = stmt.executeQuery(query);
//
//                    while (rs.next()) {
//                            wyswietlDaneZBazy(rs);
//                    } 
//
//                    conn.close();
//            } 
//            //Wyrzuć wyjątki jężeli nastąpią błędy z podłączeniem do bazy danych lub blędy zapytania o dane
//            catch(ClassNotFoundException wyjatek) {
//                    System.out.println("Problem ze sterownikiem");
//            }
//
//            catch(SQLException wyjatek) {
//                    //e.printStackTrace();
//                    //System.out.println("Problem z logowaniem\nProsze sprawdzic:\n nazwę użytkownika, hasło, nazwę bazy danych lub adres IP serwera");
//                    System.out.println("SQLException: " + wyjatek.getMessage());
//                System.out.println("SQLState: " + wyjatek.getSQLState());
//                System.out.println("VendorError: " + wyjatek.getErrorCode());
//            }
//
//    } 
    private static void wyswietlDaneZBazy(ResultSet rs){
            try{
            daneZBazy = rs.getString(1);
            System.out.println("\n" + daneZBazy + " ");
            daneZBazy = rs.getString(2);
            System.out.println(daneZBazy + " ");
            daneZBazy = rs.getString(3);
            System.out.println(daneZBazy);
            }catch(SQLException e) {
            }
    }
    
    
//    public void copyListToDB() throws SQLException{
//        //recipeList = list;
//
//        // Connect to przepisy database...
//        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/przepisy?useSSL=false","root", "komputer");
//        
//        // Check if the folder exist               
//        String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'przepisy' AND table_name = 'przepisy';";
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery(query);
//        
//        // If it does...
//        if(rs.next()){
//            // Drop table "Przepisy"...
//            String query1 = "drop table przepisy";               
//            stmt.executeUpdate(query1);
//        }
//        
//        for(SingleRecipe s : DBList){
//            System.out.println(s.getName());
//        }
//        // Create and copy recipes into the DB...
//        String query2 = "create table przepisy(nazwa varchar(40), opis varchar(40))";
//        stmt.executeUpdate(query2);
//        
//        for(SingleRecipe s : DBList){
//            String queryInsert = String.format("insert into przepisy values('%s','%s')", s.getName(), s.getDescription());
//            stmt.executeUpdate(queryInsert);
//        }
//        
//        
//        conn.close();
//
//        
//    }
}