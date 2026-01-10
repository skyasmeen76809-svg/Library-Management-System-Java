package com;

import java.util.Scanner;

class Oddeven
{
public static void main (String[]args)
{
int n;
System.out.print("ENTER ANY NUMBERS");
Scanner r=new Scanner (System.in);
n=r.nextInt();
if(n%2==0)
{
System.out.print("EVEN NUMBER");
}
else
{
System.out.print("ODD NUMBER");
  }
 }
}