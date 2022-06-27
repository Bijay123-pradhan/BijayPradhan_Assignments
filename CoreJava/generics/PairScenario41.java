package com.cg.generics;

//Scenario A - Both String

public class PairScenario41 {
  public static void main(String[] args) {
      Pair<String, String> object=new Pair<String, String>("1","Hello");
      System.out.println("{"+object.getObj1()+"="+object.getObj2()+"}");

  }
}
class Pair<K,V>{
  private K obj1;
  private V obj2;

  public Pair(K obj1,V obj2){
      this.obj1=obj1;
      this.obj2=obj2;
  }
  public K getObj1() {
      return obj1;
  }
  public V getObj2() {
      return obj2;
  }

}