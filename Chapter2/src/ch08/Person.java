package ch08;

public class Person {
	
	public int height;
	public int weight;
	public String name;
	public String gender;
	public int age;
	
	public Person(int height, int weight, String name, String gender, int age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String showPersonInfo() {
		return "Ű�� " + height + " �̰� �����԰� " + weight + " ų���� " + gender +"�� �ֽ��ϴ�. �̸��� " + name + " �̰� ���̴� " + age + "���Դϴ�.";
	}

}
