package collectionFramework;
import java.util.*;
import java.time.*;
class EmpData{
	String eName;
	int sal;
	LocalDate eDoj;
	String eDesignation;
	
	public EmpData(String eName, int sal, LocalDate eDoj, String eDesignation) {
		super();
		this.eName=eName;
		this.sal=sal;
		this.eDoj=eDoj;
		this.eDesignation=eDesignation;}
	@Override
	public String toString() {
		return "EmpData [eName=" + eName + ", sal=" + sal + ", eDoj=" + eDoj + ", eDesignation=" + eDesignation + "]";
	}}
class EmpDoj implements Comparator<EmpData>{

	@Override
	public int compare(EmpData o1, EmpData o2) {
		return o1.eDoj.compareTo(o2.eDoj);
	}
}
class SortName implements Comparator<EmpData>{
	@Override
	public int compare(EmpData o1, EmpData o2) {
		return o1.eName.compareTo(o2.eName);
	}}
class SortDesig implements Comparator<EmpData>{
	@Override
	public int compare(EmpData o1, EmpData o2) {
		return o1.eDesignation.compareTo(o2.eDesignation);
	}
}
class SortSal implements Comparator<EmpData>{
	@Override
	public int compare(EmpData o1, EmpData o2) {
		if(o1.sal>o2.sal) {
			return 1;
		}
		else if(o1.sal<o2.sal)
		{
			return -1;
		}
		else {
			return 0;
		}}}
public class ComparatorEx {
	public static void main(String[] args) {
		ArrayList<EmpData> e=new ArrayList<EmpData>();
		EmpData e1=new EmpData("Pratham", 500000, LocalDate.of(2024, 1, 27), "Mumbai");
		e.add(e1);
		e.add(new EmpData("Jilin", 100000, LocalDate.of(2024, 3, 12), "Aroli"));
		e.add(new EmpData("Abhishek", 10000, LocalDate.of(2022, 4, 11), "Mumbai"));
		e.add(new EmpData("Barai", 90000, LocalDate.of(2021, 1, 1), "Pune"));
		e.add(new EmpData("Mishra", 1000, LocalDate.of(2024, 6, 9), "Gujrat"));
		Collections.sort(e,new EmpDoj());
		for(int i = 0;i<e.size();i++) {
			System.out.println(e.get(i));}
		System.out.println("sort by name");
		Collections.sort(e,new SortName());
		for(int i = 0;i<e.size();i++) {
			System.out.println(e.get(i));}
		System.out.println("Sort by designation");
		Collections.sort(e,new SortDesig());
		for(int i = 0;i<e.size();i++) {
			System.out.println(e.get(i));}
		System.out.println("Sort by Salary");
		Collections.sort(e,new SortSal());
		for(int i = 0;i<e.size();i++) {
			System.out.println(e.get(i));
	}}}
