package lesson7;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	};
	@Override
	public void tiengKeu() {
		System.out.println("meo meo1");
	}
}
