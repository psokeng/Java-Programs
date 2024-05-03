/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass.Chapter4;

import java.util.Scanner;

/**
 *
 * @author Sokeng Paul (AG)
 */
public class Chapter4_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter:");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            System.out.println("Character is a vowel");
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Character is a consonant");
        else
            System.err.println("Invalid character");
    }
}
