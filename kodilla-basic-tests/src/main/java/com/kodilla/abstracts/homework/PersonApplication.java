package com.kodilla.abstracts.homework;

public class PersonApplication {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        Person person= new Person("Beata",30,accountant);
        person.showResponsibilities();
        Teacher teacher = new Teacher();
        Person person2 = new Person("Aga",31, teacher);
        person2.showResponsibilities();
        Programmer programmer =  new Programmer();
        Person person3 = new Person("Adam", 28, programmer);
        person3.showResponsibilities();
    }

}
