/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploarraylist3;

import java.util.*;

/**
 *
 * @author Hanne
 */
public class ExemploArrayList3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	  ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  obj.add("Ajeet");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");

	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+obj);

	  /*Add element at the given index*/
	  obj.add(0, "Rahul");
	  obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
	  obj.remove("Chaitanya");
	  obj.remove("Harry");

	  System.out.println("Current array list is:"+obj);

	  /*Remove element from the given index*/
	  obj.remove(1);

	  System.out.println("Current array list is:"+obj);
   }
}