package Basics;

import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Learn Java");
        myList.add("Walk the Dog");
        myList.add("Eat Lunch");
        System.out.println(myList);

        myList.remove(1);
        System.out.println(myList.contains("Learn Java"));
        System.out.println(myList);
    }
}
