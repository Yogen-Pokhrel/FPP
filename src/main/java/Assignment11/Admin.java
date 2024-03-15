package Assignment11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> studentMap = new HashMap<>();
		for(Student s: students){
			studentMap.put(new Key(s.getFirstName(), s.getLastName()), s);
		}
		return studentMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double totalGpa = 0.0;
		for(Student entry: maps.values()){
			totalGpa += entry.getGpa();
		}
		return totalGpa / maps.size();
}
}
