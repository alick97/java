/* A simple telephone number database that uses 
 * a property list */

import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
    	Properties ht = new Properties();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;
        
        // try to open phonebook.dat file
        try {
        	fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
        	
        }
        
        try {
        	if (fin != null) {
        		ht.load(fin);
        		fin.close();
        	}
        } catch (IOException e) {
        	
        }
        
        do {
        	System.out.println("Enter new name " + " 'quit' to stop");
        	name = br.readLine();
        	if (name.equals("quit")) continue;
        	
        	System.out.println("Enter number: ");
        	number = br.readLine();
        	ht.put(name, number);
        	changed = true;
        } while (!name.equals("quit"));
        
        if (changed) {
        	FileOutputStream fout = new FileOutputStream("phonebook.dat");
        	ht.store(fout, "Telephone Book");
        	fout.close();
        }
        
        do {
        	System.out.println("Enter name to find " + " 'quit' to quit :");
        	name = br.readLine();
        	if (name.equals("quit"))
        		continue;
        	
        	number = (String) ht.get(name);
        	System.out.println(number);
        } while (! name. equals("quit"));
    }
}
