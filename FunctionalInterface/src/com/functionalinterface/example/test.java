package com.functionalinterface.example;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


interface Building{
    void floorCompleted(int floorNumber);
    void printStatus(int floorNumber);
    void printNumberOfFloors();
}

/* model output for cut and paste
A ____ is being constructed
Construction for floor number ____ completed in ____
Floor number ____ does not exist in ____
Construction for floor number ____ completed in ____
Construction for floor number ____ not completed in ____ 
The ____ has ____ floors
*/
class School implements Building{
    int[] floors;
    School(int n){
        floors=new int[n];
        for (int i=0;i<n;i++) {
            floors[i]=0;
        }
        System.out.println("A school is being constructed");
    }
    
 public void floorCompleted(int floorNumber){
        if(floorNumber<=floors.length){
            floors[floorNumber]=1;
            System.out.printf("Construction for floor number %d completed in school\n",floorNumber);
        
        }else if(floorNumber>floors.length){
            System.out.printf("Floor number %d does not exist in school\n",floorNumber);
        }
    }
    public void printStatus(int floorNumber){
        if(floorNumber>floors.length){
            System.out.printf("Floor nuber %d does not exist in school\n",floorNumber);
        }
        else if(floors[floorNumber]==1){
            System.out.printf("Construction for floor number %d completed in school\n",floorNumber);
        }else if(floors[floorNumber]==0){
            System.out.printf("Construction for floor number %d not completed in school\n",floorNumber);
        }
        
    }
    public void printNumberOfFloors(){
        System.out.printf("The school has %d floors\n",floors.length);
    }
    
}
class Hospital implements Building{
    int[] floors;
    Hospital(int n){
        floors=new int[n];
        for (int i=0;i<n;i++) {
            floors[i]=0;
        }
        System.out.println("A hospital is being constructed");
    }
    public void floorCompleted(int floorNumber){
        if(floorNumber<floors.length){
            floors[floorNumber]=1;
            System.out.printf("Construction for floor number %d completed in hospital\n",floorNumber);
        
        }else if(floorNumber>floors.length){
            System.out.printf("Floor number %d does not exist in hospital\n",floorNumber);
        }
    }
    
    public void printStatus(int floorNumber){
        if(floorNumber>floors.length){
            System.out.printf("Floor nuber %d does not exist in hospital\n",floorNumber);
        }
        else if(floors[floorNumber]==1){
            System.out.printf("Construction for floor number %d completed in hospital\n",floorNumber);
        }else if(floors[floorNumber]==0){
            System.out.printf("Construction for floor number %d not completed in hospital\n",floorNumber);
        }
        
    }
    public void printNumberOfFloors(){
        System.out.printf("The hospital has %d floors\n",floors.length);
    }
}
public class test {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] floors = sc.nextLine().split(" ");

        School s = new School(Integer.parseInt(floors[0]));
        Hospital h = new Hospital(Integer.parseInt(floors[1]));
        s.printNumberOfFloors();
        h.printNumberOfFloors();

        String[] floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            s.floorCompleted(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            s.printStatus(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            h.floorCompleted(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            h.printStatus(Integer.parseInt(floorNumbers[i]));
        }
    }
}


