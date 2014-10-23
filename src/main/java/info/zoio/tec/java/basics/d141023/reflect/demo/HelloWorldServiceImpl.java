package info.zoio.tec.java.basics.d141023.reflect.demo;

public class HelloWorldServiceImpl implements HelloWorldService {
	public String name;

	public void sayHello(String name) {
		System.out.println("Hello," + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
