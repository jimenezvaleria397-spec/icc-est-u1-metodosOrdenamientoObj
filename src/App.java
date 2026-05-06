import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = {
            new Person("Juan", 20, new int [] {10, 15, 20}),
            new Person("Maria ", 18, new int[] {15, 15,20}),
            new Person("Pedro", 25, new int [] {20,15 ,20}),
            new Person("Ana", 22, new int []{20, 20,20}),
            new Person("Jorge", 15, new int []{10, 10, 20}),
            // imprimir 
            //intanciar
            //ordenar por edad 
            //volver a imprimir 
        };
        for(Person person: personas){
            System.out.println("=====Edades sin Ordenar=====");
            System.out.println(person);

        }
        controllers.PersonController pc =new controllers.PersonController();
        pc.sortPeopleByAge(personas);
        System.out.println("\n ====Orden por nombre====");
        for (Person person: personas){
            System.out.println(person);
        }
        pc.sortPeopleByAge(personas);
        System.out.println("\n ====Orden por edad====");
        for (Person person: personas){
            System.out.println(person);
        }
        pc.sortPeopleByAvr(personas);
        System.out.println("\n ====PROMEDIO====");
        for (Person person: personas){
            System.out.println(person);
        }
        

    }
    public void sortPeopleByAge(Person[] personas ){

    }
}
