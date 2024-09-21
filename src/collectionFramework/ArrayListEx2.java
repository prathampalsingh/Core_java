package collectionFramework;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
   ArrayList<StudentCol> al=new ArrayList<>();
        
        StudentCol scol=new StudentCol();
        scol.setId1(101);
        scol.setName1("Pooja");
        scol.setDegree1("BTECH");
        StudentCol scol1=new StudentCol();
        scol1.setId1(102);
        scol1.setName1("Priya");
        scol1.setDegree1("MCA");
        al.add(scol);
        al.add(scol1);
        System.out.println("My student List: "+al);
        StudentCol sc=new StudentCol(1, "Priya","BTECH");
        StudentCol sc1=new StudentCol(2, "Anana","BSC");
        StudentCol sc2=new StudentCol(3, "Rajvi","MCA");
        StudentCol sc3=new StudentCol(4, "Anya","BE");
        
        al.add(sc);
        al.add(sc1);
        al.add(sc2);
        al.add(sc3);
        System.out.println("My updated student List: "+al);
        
        for(StudentCol scc:al) {
            System.out.println(scc);
        }
        

	}

}
