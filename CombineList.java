import java.util.*;


public class CombineList {

  public static void main(String[] args){
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    
    list1.add(1); list1.add(2); list1.add(3);
    list2.add(4); list2.add(5); 

    list1.addAll(list2);
    System.out.println(list1);
  }

}