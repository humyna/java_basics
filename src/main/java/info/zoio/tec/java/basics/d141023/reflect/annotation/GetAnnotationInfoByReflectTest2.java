package info.zoio.tec.java.basics.d141023.reflect.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetAnnotationInfoByReflectTest2 {
	public static void main(String[] args) throws Exception {
		getAnnotationInfo("info.zoio.tec.java.basics.d141023.reflect.annotation.MyClass");
	}
	@SuppressWarnings("unused")
	private static void getAnnotationInfo(String type) throws Exception{
		Class<?> classType = Class.forName(type);
		boolean flag = classType.isAnnotationPresent(ClassAnnotation.class);
	    if (flag)
	    {
	        ClassAnnotation annotation = (ClassAnnotation) classType.getAnnotation(ClassAnnotation.class);
	        System.out.println("class annotation:" + annotation.toString());
	        System.out.println();
	    }

	    Method[] methods = classType.getMethods();
	    for(Method method : methods)
	    {
	        if (method.isAnnotationPresent(MethodAnnotation.class))
	        {
	            System.out.println("method annotation:" + ((MethodAnnotation)method.getAnnotation(MethodAnnotation.class)).toString());
	        }
	        Annotation[][] paraAnnotations = method.getParameterAnnotations();
	        for(int i = 0; i < paraAnnotations.length; i++)
	        {
	            for (Annotation a : paraAnnotations[i])
	            {
	                System.out.println("para annotation:" + a.toString());
	            }
	        }
	    }
	    System.out.println();

	    Field[] fields = classType.getFields();
	    for (Field field:fields)
	    {
	        if (field.isAnnotationPresent(FieldAnnotation.class))
	        {
	            System.out.println("field annotation:" + ((FieldAnnotation)field.getAnnotation(FieldAnnotation.class)).toString());
	        }
	    }
	}
}
