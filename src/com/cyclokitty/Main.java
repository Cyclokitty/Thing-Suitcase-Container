package com.cyclokitty;

public class Main {

    public static void main(String[] args) {
	    Thing book = new Thing("It", 3);
	    Thing rock = new Thing("geode", 2);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Rock name: " + rock.getName());
        System.out.println("Rock weight: " + rock.getWeight());

        System.out.println("This is my favourite rock: " + rock);
    }
}
