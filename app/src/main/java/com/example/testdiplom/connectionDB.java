package com.example.testdiplom;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class connectionDB {
    Connection connexion=null;

    //Создаем коннект к postgreSQL
    public Connection ConnectionDB(){
        try {
//            class.forName("org.postgresql.Driver");
            connexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/TestDiplom", "postgres", "1234");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        return connexion;
    }
    protected void cerrar_connextion(Connection con) throws Exception{
        con.close();
    }
}
