import java.util.*;
public class Main{
  
  public static void main(String args[]){
    Queue <Integer> qu = new LinkedList<>();
    qu.add(12);
    qu.add(13);
    qu.add(14);
    qu.add(15);
  
  Stack<Integer> st = new Stack<>();
  while(!qu.isEmpty()){
    int curr = qu.poll();
    st.push(curr);
  }

  while(!st.isEmpty()){
    int curr = st.pop();
    qu.add(curr);
  }

  while(!qu.isEmpty()){
    System.out.println(qu.remove());
  }
  }
}
