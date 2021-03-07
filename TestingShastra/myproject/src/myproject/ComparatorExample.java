package myproject;

import java.util.Comparator;
import java.util.TreeSet;

class StudentInfo {
	String name;
	float marks;
	String std;
	float height;

	public StudentInfo(String name, float marks, String std, float height) {
		this.name = name;
		this.marks = marks;
		this.std = std;
		this.height = height;

	}

}

class CompareOnMarks implements Comparator {
	public int compare(Object o1, Object o2) {
		StudentInfo s1 = (StudentInfo) o1;
		StudentInfo s2 = (StudentInfo) o2;
		if (s1.marks > s2.marks) {
			return 1;
		} else if (s1.marks < s2.marks) 
		{
			return -1;
		}
		 else {
			return 0;
		}
	}
	}
class CompareOnHeights implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		StudentInfo s1=(StudentInfo)o1;
		StudentInfo s2=(StudentInfo)o2;
		if(s1.height>s2.height)
		{
		return 2;
		}
		else if(s1.height<s2.height)
		{
			return -5;
		}
		else
		{
		return 0;
		}
	}
}

class ComparatorExample
{
	public static void main(String[] args) {
		StudentInfo vikas=new StudentInfo("Vikas", 87.2f, "9th", 5.6f);
		StudentInfo ajay=new StudentInfo("Ajay", 88.8f, "9th", 5.5f);
		StudentInfo vijay=new StudentInfo("Vijay", 80.58f, "9th", 6.0f);
		StudentInfo sanjay=new StudentInfo("Sanjay", 79.0f, "9th", 6.5f);
		
		TreeSet ts=new TreeSet(new CompareOnHeights());
		ts.add(vikas);
		ts.add(ajay);
		ts.add(vijay);
		ts.add(sanjay);
		
		for(Object object:ts)
		{
			StudentInfo s=(StudentInfo)object;
			System.out.println(s.name+"\t"+s.marks+"\t"+s.std+"\t"+s.height);
		}
		
		
		
	}
	
}
