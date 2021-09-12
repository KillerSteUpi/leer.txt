/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;
import java.io.*;
import java.util.*;

/**
 *
 * @author Ulises C
 */
public class Clase {
    public BufferedReader getBuffered(String link){

        FileReader lector  = null;
        BufferedReader br = null;
        try {
            File Arch=new File(link);
            if(!Arch.exists()){
                System.out.println("No existe el archivo");
            }else{
                lector = new FileReader(link);
                br = new BufferedReader(lector);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return br;
    }
    public void readTxt(){
        try {
            //ruta de tu archivo
            String ruta = "empleados1.txt";
            BufferedReader br = getBuffered(ruta);
            //leemos la primera linea
            String linea =  br.readLine();
            //creamos la matriz vacia
            String[] palabras = new String[50];
            //contador
            int contador = 0;
            while(linea != null){
                String[] values = linea.split(",");
                //recorremos el arrar de string
                for (int i = 0; i<values.length; i++) {
                    //se obtiene el primer caracter de el arreglo de strings
                    palabras [contador] = values[i];
                    
                        System.out.print("\n"+palabras[contador]);
                    
                }
                contador++;
                linea = br.readLine();
            }
            
        } 
        catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
