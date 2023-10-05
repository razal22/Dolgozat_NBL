/*
* File: Employee.java
* Author: Nagy-Berta Lázár
* Copyright: 2023, Nagy-Berta Lázár
* Group: SZOFT II/2/N
* Date: 2023-10-05
* Github: https://github.com/razal22
* Licenc: GNU GPL
*/
package models;

public class Employee {
    private String nev;
    private String telepules;
    private String cim;
    private String szuletes;
    private double fizetes;

    public Employee(String nev, String telepules, String cim, String szuletes, double fizetes){
        this.nev = nev;
        this.telepules = telepules;
        this.cim = cim;
        this.szuletes = szuletes;
        this.fizetes = fizetes;
    }
    public Employee(){

    }
    
}
