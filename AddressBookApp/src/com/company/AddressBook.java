package com.company;

import java.util.ArrayList;

public class AddressBook{
    private static ArrayList<Entry> Book = new ArrayList<Entry>();

    public static void add(Entry newEntry){
        Book.add(newEntry);
    }
    public static void list(){
        for(int i = 0; i < Book.size(); i++){
            System.out.println(Book.get(i).toString());
            System.out.println();
        }
    }
}