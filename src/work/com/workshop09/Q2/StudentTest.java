package work.com.workshop09.Q2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
	public static void main(String args[]) {
        List<Student> students = Arrays.asList(
            new Student("홍길동", 15, 170, 80),
            new Student("한사람", 13, 180, 70),
            new Student("이순신", 16, 175, 65)
        );

        System.out.println("이름  나이 신장 몸무게");
        students.forEach(s -> System.out.println(s.studentInfo()));
        System.out.println();
        
        double avgAge = students.stream().mapToInt(Student::getAge).average().orElse(0);
        double avgHeight = students.stream().mapToInt(Student::getHeight).average().orElse(0);
        double avgWeight = students.stream().mapToInt(Student::getWeight).average().orElse(0);

        Student maxAge = students.stream().max(Comparator.comparingInt(Student::getAge)).orElse(null);
        Student minAge = students.stream().min(Comparator.comparingInt(Student::getAge)).orElse(null);
        Student maxHeight = students.stream().max(Comparator.comparingInt(Student::getHeight)).orElse(null);
        Student minHeight = students.stream().min(Comparator.comparingInt(Student::getHeight)).orElse(null);
        Student maxWeight = students.stream().max(Comparator.comparingInt(Student::getWeight)).orElse(null);
        Student minWeight = students.stream().min(Comparator.comparingInt(Student::getWeight)).orElse(null);

        
        System.out.printf("나이 평균: %.3f\n", avgAge);
        System.out.printf("신장 평균: %.3f\n", avgHeight);
        System.out.printf("몸무게 평균: %.3f\n", avgWeight);
        System.out.println();
        
        System.out.println("나이가 가장 많은 학생: " + maxAge.getName());
        System.out.println("나이가 가장 적은 학생: " + minAge.getName());
        System.out.println("신장이 가장 큰 학생: " + maxHeight.getName());
        System.out.println("신장이 가장 작은 학생: " + minHeight.getName());
        System.out.println();
        
        System.out.println("몸무게가 가장 많이 나가는 학생: " + maxWeight.getName());
        System.out.println("몸무게가 가장 적게 나가는 학생: " + minWeight.getName());
    }

}
