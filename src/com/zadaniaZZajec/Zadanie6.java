package com.zadaniaZZajec;

// DZIEDZICZENIE

public class Zadanie6 {
    static class Student extends Person{
        private int index;
        public Student(String name, int index){
            super(name);
            this.index=index;
        }
        public int getIndex(){
            return index;
        }
    }
    static class Person{
        private String name;
        public Person(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
    }

    public static void main(String[] args) {
        Person p = new Person ("Sylwia");
        Student s = new Student("Sylwia",1234);

        System.out.println(s.getName());
        System.out.println(s.getIndex());

        Person person = s;
        System.out.println(person.getName());
        if (p instanceof Student){
            Student student = (Student)p;
        }
    }
}
