package info.zoio.tec.java.basics.d141023.reflect.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 利用反射获取类的注解信息
 *
 * @author humyna
 *
 */
public class GetAnnotationInfoByReflectTest1 {
	public static void main(String[] args) {
		getAnnotationInfo();
	}

	private static void getAnnotationInfo(){
		MyClass myClass =  new MyClass();
		Annotation[] annotations = myClass.getClass().getAnnotations();
		if(annotations.length > 0){
			for (Annotation annotation : annotations) {
				System.out.println("class annotation:" + annotation.toString());
			}
			System.out.println();
		}else{
			System.out.println("no annotation");
		}

		Method [] methods = myClass.getClass().getMethods();
		if(methods.length > 0){
			for (Method method : methods) {
				annotations = method.getAnnotations();
				for (Annotation annotation : annotations) {
					System.out.println("method annotation:" + annotation.toString());
				}

				Annotation[][] paraAnnotations = method.getParameterAnnotations();
				for (int i = 0; i < paraAnnotations.length; i++) {
					for (Annotation annotation : paraAnnotations[i]) {
						System.out.println("parameters annotation:" + annotation.toString());
					}
				}
			}
			System.out.println();
		}else{
			System.out.println("no method");
		}

		Field[] fields = myClass.getClass().getFields();//filed是public
		if(fields.length > 0){
			for (Field field : fields) {
				annotations = field.getAnnotations();
				for (Annotation annotation : annotations) {
					System.out.println("field annotation:" + annotation.toString());
				}
			}
			System.out.println();
		}else{
			System.out.println("no field");
		}
	}
}
