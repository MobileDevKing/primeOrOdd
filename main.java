package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        if(prime(k))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
    public static boolean prime(int a)
    {
        boolean t=true;
        if(a<=1)
        {
            t=false;
        }
        for (int k=2;k<=Math.sqrt((double) a);k++)
        {
            if(a%k==0)
            {
                t=false;break;
            }
        }
        return t;
    }
}
