/**
 * 
 */
package com.practice.JStreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author GSharma2
 *
 */
public class TestStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> uni_students=populateStudent();
		List<Student> clg_students=populateStudent();
		
		System.out.println(uni_students.stream().filter(s->s.getAge()>21).collect(Collectors.toSet()).toString());
		System.out.println("second list"+
		//uni_students.stream().filter(
			//	s->clg_students.stream().filter(t->t.equals(s)).collect(Collectors.toList())).collect(Collectors.toList()));
		
		uni_students.stream().filter(s->s.getCity().
				equals(clg_students.stream().filter(c->c.getCity().equals(s.getCity()))))
				
				.collect(Collectors.toList()));
				
		System.out.println((clg_students.stream().map(Student::getAge).
				collect(Collectors.toList())).toString());
		
		//populateStudent(clg_students);	
	}

	private static List<Student> populateStudent() {
		String[] names ={"A","B","C","D","E","F","G",};
		String[] cities ={"c1","c2","c3","c4","c5","c6","c7"};
		String[] sports ={"s1","s2","s3","s4","s5","s6","s7"};
		Student s1 = new Student();
		s1.setName("A");
		s1.setCity("c1");
		s1.setAge(21);
		s1.setPlay_games("g1");
		s1.setPlayer(true);
		Student s2 = new Student();
		s2.setName("B");
		s2.setCity("c2");
		s2.setAge(21);
		s2.setPlay_games("g2");
		s2.setPlayer(true);
		Student s3 = new Student();
		s3.setName("C");
		s3.setCity("c3");
		s3.setAge(22);
		s3.setPlay_games("g3");
		s3.setPlayer(true);
		Student s4 = new Student();
		s4.setName("c");
		s4.setCity("c1");
		s4.setAge(22);
		s4.setPlay_games("g2");
		s4.setPlayer(true);
		Student s5 = new Student();
		s5.setName("A");
		s5.setCity("c3");
		s5.setAge(21);
		s5.setPlay_games("g1");
		s5.setPlayer(true);
		List<Student> stu_list = new ArrayList<>();
		stu_list.add(s5);
		stu_list.add(s4);
		stu_list.add(s3);
		stu_list.add(s2);
		stu_list.add(s1);
		return stu_list;
		/*Arrays.stream(names).forEach(
				new Student().setName(
				names[(int)Math.random()*10<names.length?(int)Math.random()*10:0]));*/
		
	}

}
