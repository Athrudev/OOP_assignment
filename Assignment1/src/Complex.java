//package com.exam.complex; 
import java.util.Scanner; 
public class Complex                // Default Constructor 
{ 
  float real,imag; 
 
  Complex(int r,int i)            // Parameterized Constructor 
  { 
   this.real=r; 
   this.imag=i; 
  } 
  void add( Complex a)                                      //method for addition 
  { 
   Complex temp=new Complex(0,0); 
   temp.real=this.real+a.real; 
   temp.imag=this.imag+a.imag; 
   System.out.println("Addition of given Complex is\n"+this.real+"+"+this.imag+"i + " 
   +a.real+"+"+a.imag+"i = "+temp.real+"+"+temp.imag+"i"); 
  } 
  void sub( Complex a)                                  //method for subtraction 
    { 
     Complex temp=new Complex(0,0); 
     temp.real=this.real-a.real; 
     temp.imag=this.imag-a.imag; 
     System.out.println("Subtraction of given Complex is\n"+this.real+"+"+this.imag+"i - " 
      +a.real+"+"+a.imag+"i = "+temp.real+"+"+temp.imag+"i"); 
 
  } 
  void mul( Complex a)                                                     //method for multiplication 
      { 
       Complex temp=new Complex(0,0); 
       temp.real=( (this.real * a.real) - (this.imag * a.imag)); 
         temp.imag = ((this.real * a.imag) + (this.imag * a.real)); 
         System.out.println("Multiplication of given Complex is\n"+this.real+"+"+this.imag+"i * " 
      +a.real+"+"+a.imag+"i = "+temp.real+"+"+temp.imag+"i"); 
 
  } 
  void div(Complex a)                                              //method for division 
  { 
   Complex temp=new Complex(0,0); 
  temp.real=((this.real*a.real+this.imag*a.imag)/(a.real*a.real+a.imag*a.imag)); 
  temp.imag=((this.imag*a.real-this.real*a.imag)/(a.real*a.real+a.imag*a.imag)); 
  System.out.println("Division of given Complex is\n"+this.real+"+"+this.imag+"i / " 
     +a.real+"+"+a.imag+"i = "+temp.real+"+"+temp.imag+"i"); 
 
 
} 
public static void main(String[] args) 
{ 
 String repeat; 
 Scanner sc=new Scanner(System.in);                // Create Scanner class obj for input 
 System.out.println("Enter real part of 1st number"); 
 int a1=sc.nextInt(); 
 System.out.println("Enter imaginary part of 1st number"); 
 int a2=sc.nextInt(); 
 System.out.println("Enter real part of 2nd number"); 
 int b1=sc.nextInt(); 
 System.out.println("Enter imaginary part of 2nd number"); 
 int b2=sc.nextInt(); 
 
    Complex c1=new Complex(a1,a2);             //create Complex class 1st object  
    Complex c2=new Complex(b1,b2);            //create Complex class 2nd object 
    do { 
      System.out.println("Enter operation of choice");        //Menu Driven 
  
 System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division"); 
   int choice = sc.nextInt(); 
   switch(choice) { 
   case 1: 
    c1.add(c2);       // call add method 
    break; 
   case 2: 
    c1.sub(c2);       // call sub method 
    break; 
   case 3: 
    c1.mul(c2);     // call mul method 
    break; 
   case 4: 
    c1.div(c2);      // call div method 
    break; 
   default: 
    System.out.println("Invalid operation"); 
   } 
   System.out.println("Do you wish to use the calculator again\nType Yes to confirm\nPress any other key to exit"); 
   repeat = sc.next(); 
   repeat = repeat.toLowerCase(); 
 
}while(repeat.equals("yes")); 
} 
} 