
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input=in.nextLine();
        int length= input.length();
        System.out.println(input+" has "+length+" characters.");
        in.close();
    }
}
