package collectionFramework;
import java.util.*;
 class Insect {
	private String ins_name;
	private int weight ;
	public Insect() {
		super();
		this.ins_name=ins_name;
		this.weight=weight;
	}
	public String getIns_name() {
		return ins_name;
	}
	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "InsectCollectionEx [ins_name=" + ins_name + ", weight=" + weight + "]";
	}
}
class Insecticides{
	public List<String> mapInsectstname(List<Insect> list) {
		List<String> s=new ArrayList<>();
		for (Insect i:list) {
			s.add(i.getIns_name());
		}
		return s;
	}
	public List<Insect> getWeight(List<Insect> list){
		List<Insect> s1=new ArrayList<>();
		for (Insect i:list) {
			int weight = i.getWeight();
			if(weight>40 && weight<=100) {
				s1.add(i);
			}
		}
		return s1;
	}
}

