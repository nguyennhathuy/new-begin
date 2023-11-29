package lesson7;

public class Dog extends Animal{
	public Dog(String name, int age) {
		super(name, age);
	};
	@Override
	public void tiengKeu() {
		System.out.println("gau gau1");
	}
}
