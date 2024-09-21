package collectionFramework;

import java.util.ArrayList;

public class InscetMain {

	public static void main(String[] args) {
		   ArrayList<Insect> al=new ArrayList<>();
	        
		   Insect ins=new Insect();
	        ins.setIns_name("ant");
	        ins.setWeight(45);
	        Insect ins1=new Insect();
	        ins1.setIns_name("bee");
	        ins1.setWeight(80);
	        al.add(ins1); 
	        al.add(ins);
	        Insecticides ins2=new Insecticides();
	        
	        System.out.println("insect name "+ins2.mapInsectstname(al));
	        System.out.println("weight between 40 and 100 "+ins2.getWeight(al));

	}

}
