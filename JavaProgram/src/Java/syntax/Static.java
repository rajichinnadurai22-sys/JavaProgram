package Java.syntax;

public class Static {

	static int myStaticVariable;
	static {
		System.out.println("This is Static block");
		myStaticVariable = 10;
	}

	static void myStaticMethod() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(myStaticVariable);
		myStaticMethod();
	}
}
