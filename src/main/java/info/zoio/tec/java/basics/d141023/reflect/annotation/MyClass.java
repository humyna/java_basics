package info.zoio.tec.java.basics.d141023.reflect.annotation;

@ClassAnnotation("this is a class annotation!")
public class MyClass {
	@FieldAnnotation("this is a field annotation！")
	public String name;

	@MethodAnnotation(methodName="getName",returnType="String")
	public String getName() {
		return name;
	}

	@MethodAnnotation(methodName="setName",returnType="void")
	public void setName(@ParameterAnnotation("this is a para annotation")String name) {
		this.name = name;
	}
}
