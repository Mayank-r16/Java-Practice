/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
Note: You may find the String.split method helpful in completing this challenge.
*/

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String tokens[] = s.trim().split("[!,?._'@\\s]+");
    int size = tokens.length;
    System.out.println(size);
    for(int i=0; i<tokens.length; i++){
      System.out.println(tokens[i]);
    }
  }
}
  
