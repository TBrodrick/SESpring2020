package com.company;

public class Entry {
    private String FirstName;
    private String LastName;
    private String Street;
    private String City;
    private String State;
    private int Zip;
    private String Phone;
    private String Email;

    Entry(){
        FirstName = "first";
        LastName = "last";
        Street = "street";
        City = "city";
        State = "state";
        Zip = 0;
        Phone = "(000)000-0000";
        Email = "Example@example.com";
    }

    Entry(String first, String last, String street, String city, String state, int zip, String phone, String email){
        FirstName = first;
        LastName = last;
        Street = street;
        City = city;
        State = state;
        Zip = zip;
        Phone = phone;
        Email = email;
    }
    public String toString(){
       return "First Name: " + FirstName + "\nLast Name: " + LastName + "\nStreet: " + Street + "\nCity: " + City + "\nState: " + State + "\nZip: " + Zip + "\nPhone: " + Phone + "\nEmail: " + Email;
    }

    public void setFirstName(String name){
        FirstName = name;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setLastName(String name){
        LastName = name;
    }
    public String getLastName(){
        return LastName;
    }
    public void setStreet(String street){
        Street = street;
    }
    public String getStreet(){
        return Street;
    }
    public void setCity(String city){
        City = city;
    }
    public String getCity(){
        return City;
    }
    public void setState(String state){
        State = state;
    }
    public String getState(){
        return State;
    }
    public void setZip(int zip){
        Zip = zip;
    }
    public int getZip(){
        return Zip;
    }
    public void setPhone(String phone){
        Phone = phone;
    }
    public String getPhone(){
        return Phone;
    }
    public void setEmail(String email){
        Email = email;
    }
    public String getEmail(){
        return Email;
    }
}
