package JAVA8;

@FunctionalInterface
interface MyRefrenceInterfacee {
   void display();
}
public class MethodReferenceExample 
{
   public void myMethod()//Instance method
   {
       System.out.println("Instance Method");
   }
   
   public static void myMethod1()//Static method
   {
       System.out.println("Static Method1");
   }
   public static void main(String[] args) {
       MethodReferenceExample obj = new MethodReferenceExample();
       obj.myMethod();
       myMethod1();
//method reference
       System.out.println("****Method reference ");
       MyRefrenceInterfacee ref = obj :: myMethod;
       // calling method fun interface
       ref.display();
       
       MyRefrenceInterfacee ref1 = MethodReferenceExample :: myMethod1;
        ref1.display();
       
   }
}