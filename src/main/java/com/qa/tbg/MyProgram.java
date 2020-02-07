package com.qa.tbg;
import java.util.Scanner;

public class MyProgram  {//extends ConsoleProgram

 
	public static void main(String[]args) {

		    
		        Scanner readName = new Scanner(System.in);
		        System.out.print("Enter your name: ");
		        String userName = readName.nextLine();
   
		        Scanner readRole = new Scanner(System.in);
		        System.out.print("Choose your character (Professor Dumbledore,Severus Snape,Harry Potter,Voldemort): ");
		        String userRole = readRole.nextLine();
		        while(true){
		            if(userRole.equalsIgnoreCase("Professor Dumbledore") || userRole.equalsIgnoreCase("Severus Snape") || userRole.equalsIgnoreCase("Harry Potter")|| userRole.equalsIgnoreCase("Voldemort")){
		            	
		            	System.out.println("Welcome to the infinite grey swamp " +userRole);
		            
		            	break;
		                
		            }else{
		                System.out.println("Choose a valid role");
		                readRole = new Scanner(System.in);
		                System.out.print("Choose your character (Dumbledore,Severus Snape,Harry Potter,Voldemort): ");		         
		                userRole = readRole.nextLine();		          
		          
		            }
		        }
		        System.out.println("name");
		        if(userRole == "Professor Dumbledore") {
		        	System.out.println("You have been assigned the white compass");
		        	
		        	
		        	}else { 	
		           	
		        	if(userRole == "Severus Snape") {
		        	System.out.println("You have been assigned the purple compass");
		        	
		        	
		        	
		        	}else{    
		        		
		            if (userRole == "Harry Potter") {
		            System.out.println("you have been assigned the Golden compass");
		           
		            
		            }else {  
		        	
		            if(userRole == "Voldemort") {
		            System.out.println("you have been assigned the black compass my dark lord");
		            
		            
		            
		        
	}






 
    }}}}}
    
		            
		            
		        

		
		


		
	