/*
* File: MainController.java
* Author: Nagy-Berta Lázár
* Copyright: 2023, Nagy-Berta Lázár
* Group: SZOFT II/2/N
* Date: 2023-10-05
* Github: https://github.com/razal22
* Licenc: GNU GPL
*/
package controllers;

import java.util.ArrayList;

import models.Employee;
import models.Filereader;
import views.MainConsole;

public class MainController {
    public MainController() {
        Filereader fileReader = new Filereader();
        ArrayList<Employee> employees = fileReader.readFile();
        MainConsole.showData(employees);
    }
}