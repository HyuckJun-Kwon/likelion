package work.com.workshop09.Q2;

public class Student {
	private String name;
	private int age, height, weight;

	public Student(String name, int age, int height, int weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	}

	public int getAge() { return age; }
	public int getHeight() { return height; }
	public int getWeight() { return weight; }
	public String getName() { return name; }
	
	public String studentInfo() {
	    return name + " " + age + " " + height + " " + weight;
	}

}
