package JAVA8;
@FunctionalInterface
interface MyDaufaltInterface1 {
   public String sayHello(); // only 1 abstract method    
}
@FunctionalInterface
interface MyDaufaltInterPara {
   public String sayHello1(String s); // only 1 abstract method    
}
@FunctionalInterface
interface MyDaufaltInterVoid {
   public void sayHello2(); // only 1 abstract method    
}
@FunctionalInterface
interface MyInterface2Para{
   public int add(int a,int b);
}
@FunctionalInterface
interface MyInterface2Paraa{
   public void mul(int a,int b);
}
@FunctionalInterface
interface MultiPara {
   public int sub(int i,int j);
}
public class LambdaWithNoParameterExample {
   public static void main(String[] args) {
       MyDaufaltInterface1 msg = () ->
       {
           return "Hello Lambda Ecpression";
       };
       System.out.println(msg.sayHello());
       MyDaufaltInterPara msg1=(String str)->{return "Hello"+str;};
       System.out.println(msg1.sayHello1(" Everyone"));
       MyInterface2Para add=(int x,int y)->{
           return x+y;
       };
       System.out.println("Addition: "+add.add(23, 45));
       MyInterface2Paraa m=(int x,int y)->System.out.println("Multiplication:"+x*y);
       m.mul(4,5);
 
       MyDaufaltInterVoid v1=() ->System.out.println("hello");
       v1.sayHello2();
      MultiPara m1= (int i,int j) ->{
    	  System.out.println("i : "+i);
    	  System.out.println("j : "+j);
    	  return i-j;
      };
      System.out.println("subtraction using multiple statements i-j = "+m1.sub(10, 5));
   }
   
   
}