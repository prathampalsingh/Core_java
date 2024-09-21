package CoreJavaEx;

class F1_position{  
void pole(){System.out.println("Max verstappen");}  
}  
class provisnal extends F1_position{  
void second(){System.out.println("Charles leclar");}  
}  
class Row extends provisnal{  
void third(){System.out.println("lewis hamiltion");}  
}  
class Multilevel_inheritence {  
public static void main(String args[]){  
Row r=new Row();  
r.pole();  
r.second();  
r.third();  
}}  