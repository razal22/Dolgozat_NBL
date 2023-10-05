/*
* File: Filereader.java
* Author: Nagy-Berta Lázár
* Copyright: 2023, Nagy-Berta Lázár
* Group: SZOFT II/2/N
* Date: 2023-10-05
* Github: https://github.com/razal22
* Licenc: GNU GPL
*/
package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
   
    public static ArrayList<Employee> readFile() throws IOException{
        final ArrayList<Employee> emplist = new ArrayList<>();

        try{
            File file = new File("adat.txt");
            Scanner sc = new Scanner(file, "UTF-8");

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] sor = line.split(":");
                emplist.add(sor);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("Nincs meg a file!");
        }
        
        return emplist;

    }
}