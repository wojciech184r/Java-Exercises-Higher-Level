package com.zadaniaZZajec;

// POLIMORFIZM EXAMPLE

public class Zadanie4 {
    static class Animal{
        private final String name;
        protected Animal(String name){
            this.name = name;
        }
        public void speak(){
            System.out.println("");
        }
        public String getName(){
            return name;
        }
    }
    static class Crocodile extends Animal{
        Crocodile(){
            super("Crocodile");
        }
        public void speak(){
            System.out.println("sznip sznap");
        }
    }
    static class Flamingo extends Animal{
        Flamingo(){
            super("Flamingo");
        }
        public void speak(){
            System.out.println("cwir cwir");
        }
    }
    static class Fox extends Animal{
        Fox(){
            super("Fox");
        }
        public void speak(){
            System.out.println("Auuuuuuuu");
        }
    }
    static class Cat extends Animal{
        Cat(){
            super("cat");
        }
        public void speak(){
            System.out.println("mial mial");
        }
    }

    public static void main(String[] args) {
        Flamingo flamingo = new Flamingo();
        Crocodile crocodile = new Crocodile();
        Fox fox = new Fox();
        Cat cat = new Cat();

        Animal[] zoo = new  Animal[]{flamingo,crocodile,cat,fox};
        for (Animal animal : zoo){
            System.out.println(animal.getName());
            System.out.println(" : ");
        }
        System.out.println("What dose the Fox say");
        fox.speak();
    }
}
