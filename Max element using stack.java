import java.util.*;
import static java.lang.Math.*;
public class Main{
  public static void main(String args[]){
    Stack <Integer> st = new Stack<>();
    Stack <Integer> maxst = new Stack<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();      
    }

  
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      int val = Math.max(max, arr[i]);
      maxst.push(val);
      max = Math.max(max, arr[i]);
    }
    System.out.println(maxst.pop());
  }
}
