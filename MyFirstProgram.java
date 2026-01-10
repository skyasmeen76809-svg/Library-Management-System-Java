package com;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
	    System.out.println("Hello world");
	    
	    Scanner scanner = new Scanner(System.in);

	    String text=scanner.nextLine();
	    
	    List list=new ArrayList();
	    list.add("rest1");
	    list.add("rest2");
	    list.add("rest3");
	    list.add("rest4");
	    
	    if (text.startsWith("ya")) {
	    	System.out.println(text + " Queen working from chandrayangutta" + list);
	    }
	 //   else
	 //   System.out.print("No Queen");
	    
	    if (text.startsWith("te")) {
	    	System.out.println(text + " Queen working from babnagar" + list);
	    }
	    else
	    System.out.print("No Queen");
	    
	    
	}

}
