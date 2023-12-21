package lesson9;

class Animal {
	public Animal() throws InterruptedException{
		System.out.println("animal");
	}
}

public class test {
	public static void main(String[] args) {
		Animal meo = new Animal();
	}
	
	public static int doDoDai(String item) {
		return item.length();
	}
}
