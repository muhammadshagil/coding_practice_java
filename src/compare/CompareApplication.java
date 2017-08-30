package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CompareApplication {
	
	public static void main(String[] args){
		ArrayList al=new ArrayList();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		
		
		System.out.println("Sorting by Name...");  
		Collections.sort(al,new NameComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		} 
		
		
		System.out.println("Sorting by Age...");  
		Collections.sort(al,new AgeComparator());
		Iterator ageIt = al.iterator();
		while(ageIt.hasNext()){
			Student st = (Student) ageIt.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
		}
	}

}
