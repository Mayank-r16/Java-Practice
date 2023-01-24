/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. Can you determine if a given string, s, is a palindrome?
To solve this challenge, we must first take each character in s, enqueue it in a queue, and also push that same character onto a stack. Once that's done, we must dequeue the first character from the queue and pop the top character off the stack, then compare the two characters to see if they are the same; as long as the characters match, we continue dequeueing, popping, and comparing each character until our containers are empty (a non-match means s  isn't a palindrome).
Write the following declarations and implementations:
1.     Two instance variables: one for your stack, and one for your queue.
2.     A void pushCharacter(char ch) method that pushes a character onto a stack.
3.     A void enqueueCharacter(char ch) method that enqueues a character in the  queue instance variable.
4.     A char popCharacter() method that pops and returns the character at the top of the stack instance variable.
5.     A char dequeueCharacter() method that dequeues and returns the first character in the queue instance variable.
*/

import java.util.*;
import java.io.*;
public class Main{
  Stack <Character> st = new Stack<>();
  Queue <Character> qu = new LinkedList<>();
  void pushCharacter(char ch){
    st.push(ch);
  }
  void enqueueCharacter(char ch){
    qu.add(ch); 
  }
  char popCharacter(){
    return st.pop();
  }
  char dequeueCharacter(){
    return qu.remove();
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter the string: ");
  String s = sc.nextLine();
  sc.close();
  Main p = new Main();
  for(int i=0; i<s.length(); i++){
    p.pushCharacter(s.charAt(i));
    p.enqueueCharacter(s.charAt(i));
  }
boolean isPalindrome = true;

for(int i=0; i<s.length(); i++){
  if(p.popCharacter() != p.dequeueCharacter()){
    isPalindrome = false;
    break;
  }
}
System.out.println(isPalindrome);
    
  }
}
  
