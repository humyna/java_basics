package info.zoio.tec.java.basics.d141023.reflect.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射简单示例
 *
 * @author humyna
 *
 */
public class ReflectTest {
	public static void main(String[] args) throws Exception {
		//print class info
		printClassTypeInfo("info.zoio.tec.java.basics.d141023.reflect.demo.HelloWorldServiceImpl");

		//create instantiation
		createInstantiation("info.zoio.tec.java.basics.d141023.reflect.demo.HelloWorldServiceImpl");

		//invoke method
		invokeMethod("info.zoio.tec.java.basics.d141023.reflect.demo.HelloWorldServiceImpl");

		//modify Field
		modifyField("info.zoio.tec.java.basics.d141023.reflect.demo.HelloWorldServiceImpl");
	}

	private static void printClassTypeInfo(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//TODO uncheck parameters
		Class<?> clazz =  Class.forName(type);

		Method[] methods =  clazz.getMethods();

		if(methods.length > 0){
			System.out.println("print methods info:");
			for (Method method : methods) {
				System.out.println(method.toGenericString());
			}
		}else{
			System.out.println("no method!");
		}
		System.out.println();
		Field[] fields = clazz.getDeclaredFields();
		if(fields.length > 0){
			System.out.println("print fields info:");
			for (Field field : fields) {
				System.out.println(field.toGenericString());
			}
		}else{
			System.out.println("no field");
		}
		System.out.println();
	}

	private static void createInstantiation(String type) throws Exception{
		//TODO uncheck parameters
		Class<?> clazz = Class.forName(type);
		HelloWorldService helloWorldService = (HelloWorldServiceImpl)clazz.newInstance();

		helloWorldService.sayHello("Humyna");
		System.out.println();
	}

	private static void invokeMethod(String type) throws Exception{
		//TODO uncheck parameters
		Class<?> clazz = Class.forName(type);
		HelloWorldService helloWorldService = (HelloWorldServiceImpl)clazz.newInstance();

		Method  method = clazz.getMethod("sayHello", new Class[]{String.class});
		method.invoke(helloWorldService, new Object[]{"Humyna"});
		System.out.println();
	}

	private static void modifyField(String type) throws Exception{
		//TODO uncheck parameters
		Class<?> clazz = Class.forName(type);
		HelloWorldServiceImpl helloWorldService = (HelloWorldServiceImpl)clazz.newInstance();
		System.out.println("before modification:" + helloWorldService.getName());

		Field field = clazz.getField("name");//name只能为public
		field.set(helloWorldService, "humyna_new");
		System.out.println("after modification:" + helloWorldService.getName());
		System.out.println();
	}
}
