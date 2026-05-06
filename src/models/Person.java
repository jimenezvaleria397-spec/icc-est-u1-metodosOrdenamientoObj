package models;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private int[] grades;


    public Person(String name, int age, int [] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;

    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public double average(){
        double sum =0;
        for(int grade: grades){
            sum = sum + grade;
        }
        double average = sum / grades.length;
        return average;
    }


    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", grades=" + Arrays.toString(grades) + "promedio= " + average()
        + "]";
        }

    


    
    
    
}
