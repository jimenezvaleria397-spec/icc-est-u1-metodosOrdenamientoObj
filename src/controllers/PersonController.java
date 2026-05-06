package controllers;
import models.Person;

public class PersonController {
    // metodo que ordena personas por su edad 
    public void sortPeopleByAge(Person[] personas ){

        for (int i=1; i < personas.length; i++){
            Person aux = personas[i];
            int j = i -1;
            while( j >= 0 &&
                personas[j].getAge() > aux.getAge()){
                    j--;
                }
                personas [j + 1] =aux;
            }
                //equuals = nos dice si son iguales 
                //equialsIgnoreCase= sirve para ver si 2 cadenas de texto son iguales
                //devulve booleanos 
        }
    public void sortPeopleByName(Person[] personas ){

        for (int i=1; i < personas.length; i++){
            Person aux = personas[i];
            int j = i -1;
            while( j >= 0 &&
                personas[j].getName().compareTo(aux.getName()) > 0){
                    j--;
                }
                personas [j + 1] =aux;
        }
    }
    public void sortPeopleByAvr(Person[] personas ){

        for (int i=1; i < personas.length; i++){
            Person aux = personas[i];
            int j = i -1;
            while( j >= 0 &&
                personas[j].average() > aux.average()){
                    j--;
                }
                personas [j + 1] =aux;
        }

    }
}
