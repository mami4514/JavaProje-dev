/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprojeodevi;

import java.sql.SQLException;

/**
 *
 * @author UTKU
 */
public class JavaProjeOdevi {
    public static int hata;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try{
            Database.dbCreate();
            
        }catch (SQLException e ){
           
           hata = e.getErrorCode();
            System.out.println(e.toString());
           if(hata == 1007){
               System.out.println(hata);
           }
           
        }
        if(hata != 1007){
            AnaSayfa.init();
        }
        
        
    }
    
}
