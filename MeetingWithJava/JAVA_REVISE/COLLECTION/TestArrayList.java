// package JAVA_REVISE.COLLECTION;

import java.util.ArrayList;

public class TestArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(5);
    for (int i = 1; i <= 5; i++) {
      arrayList.add(i);
    }
    System.out.println(arrayList);
  }
}
