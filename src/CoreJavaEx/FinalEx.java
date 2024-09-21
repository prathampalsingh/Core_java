package CoreJavaEx;

//final variable-->we can't change value
//final method -->we can't override it
//final class-->we can't extend it
 class Parent1{
   void display() {
      System.out.println("PAren class final method");
  }
}
public class FinalEx extends Parent1{//we declare any class final we can not extend
  final int a=10;//we can not change value
  int b=20;
      void display() {//we can not override final method
      super.display();
      }
      
  public static void main(String[] args) {
      FinalEx f=new FinalEx();
      //f.a=15;
      f.b=35;
      int sum;
      sum=f.a+f.b;
      
      System.out.println(sum);
  }
}
