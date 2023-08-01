package com.javaprogram.collections;
import java.util.*;

class AscStudentComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}
class NameStudentComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> li=List.of(new Students(6,"Shreya"),new Students(1,"Raghav")
				,new Students(3,"Jaya"),new Students (8,"Adya"));
		ArrayList<Students> al=new ArrayList<>(li);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, new AscStudentComparator());//giving custom comparator
//		al.sort(new AscStudentComparator());
		System.out.println(al);
		al.sort(new NameStudentComparator());
		System.out.println(al);
		
	}

}
