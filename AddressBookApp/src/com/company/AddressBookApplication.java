package com.company;

public class AddressBookApplication {

	public static AddressBook ab;

    public static void main(String[] args) {
    	initAddressBook();
    	ab.list();
	    /*Menu.prompt_FirstName();
	    Menu.prompt_LastName();
	    Menu.prompt_Street();
	    Menu.prompt_City();
	    Menu.prompt_State();
	    Menu.prompt_Zip();
	    Menu.prompt_Phone();
	    Menu.prompt_Email();*/
    }
    public static void initAddressBook(){
    	Entry entry1 = new Entry("Tristan", "Brodrick", "25200 Carlos Bee Blvd", "Hayward", "CA", 94542, "(707)239-1512", "tbodrick@horizon.csueastbay.edu");
		Entry entry2 = new Entry();
    	ab.add(entry1);
		ab.add(entry2);
	}
}
