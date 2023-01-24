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
  
