package com.jenkinspmd;

import java.util.Scanner;
import java.util.Scanner;
import java.lang.*;

/**
 * Hello world!
 *
 */
public class JenkinsPmd 
{
	private String name;
	private static String age;
	private Boolean flag;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try {
        	System.out.println("Try Block");
        }
        catch (NoSuchMethodError e) {
			
		}
        catch (Exception e) {
			// TODO: handle exception
		}
        
        Scanner scanner = new Scanner(System.in);
        
        JenkinsPmd jenkinsPmd = new JenkinsPmd();
        
        Scanner sc = new Scanner(System.in); 
        sc.nextLine();
    }
    
    private void testMethods() {
    	System.out.println("Private test methods");
    }
    
    private void testMethod() {
    	System.out.println("Private test methods");
    }
    
    public void emptyIfStmtBlock() {
    	if (true) {
			
		} else {

		}
    }
}
