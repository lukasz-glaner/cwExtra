package com.company;

import javax.swing.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Person person1 = new Person("Maciek", "Kowalski", "123456789", 20);
//        Person person2 = new Person("Kamil", "Nowak", "132476587", 45);
//        Person person3 = new Person("Wojtek", "Bosak", "985645345", 13);

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.setName("Maciek");
        person1.setSurname("Kowalski");
        person1.setPesel("132476587");
        person1.setAge(45);

        person2.setName("Wojtek");
        person2.setSurname("Bosak");
        person2.setPesel("985645345");
        person2.setAge(13);

        person3.setName("Maciek");
        person3.setSurname("Kowalski");
        person3.setPesel("123456789");
        person3.setAge(20);

        HashMap<String, Person> hashMap1 = new HashMap<String, Person>();
        hashMap1.put(person1.getPesel(), person1);
        hashMap1.put(person2.getPesel(), person2);
        hashMap1.put(person3.getPesel(), person3);

        System.out.println(hashMap1.get("132476587"));

    }
}
