package info.zoio.tec.java.basics.d141016.passby;

/**
 * 记住:Java是按照值传递
 *
 * 首先明确
 * 栈：存放基本类型，包括char/byte/short/int/long/float/double/boolean
 * 堆：存放引用类型，同时一般会在栈中保留一个指向它的指针，而GC判断一个对象是否可以回收，就是判断栈中是否有指针指向堆中的对象。
 *
 * 因为传递的都是存储在栈中的内容，无论是基本类型的值，还是指向堆中对象的指针，都是值而非引用。并且在值传递的过程中，JVM会将值【复制一份】，然后将复制后的值传递给调用方法。
 * 记住上面描述中的【复制】这两个字就可以了，原值都不会改变的
 *
 * 总结：
 * 	1. 对于基本类型，在方法体内对方法参数进行重新赋值，并不会改变原有变量的值。
 * 	2. 对于引用类型，在方法体内对方法参数进行重新赋予引用，并不会改变原有变量所持有的引用。
 * 	3. 方法体内对参数进行运算，不影响原有变量的值。
 * 	4. 方法体内对参数所指向对象的属性进行运算，将改变原有变量所指向对象的属性值。
 *
 * 原因：
 * 在JAVA中变量有以下两种
 * 1. 基本类型变量，包括char、byte、short、int、long、float、double、boolean。
 * 2. 引用类型变量，包括类、接口、数组（基本类型数组和对象数组）。
 * 当基本类型的变量被当作参数传递给方法时，JAVA虚拟机所做的工作是把这个值拷贝了一份，然后把拷贝后的值传递到了方法的内部。
 * 当引用型变量被当作参数传递给方法时，JAVA虚拟机会拷贝一份这个变量所持有的引用，然后把它传递给JAVA虚拟机为方法创建的局部变量，从而这两个变量指向了同一个对象。
 *
 * @author humyna
 *
 */
public class ValueOrReferenceTest {
	public static void main(String[] args) {
		ParamObject t = new ParamObject();
		System.out.println("参数--基本类型");
		System.out.println("原有的值：" + t.value);//0
		// 为基本类型参数重新赋值
		t.change(t.value);
		System.out.println("赋值之后：" + t.value);//0

		// 为引用型参数重新赋值
		t.change(t);
		System.out.println("运算之后：" + t.value);//0

		//t = new ParamObject();
		System.out.println("参数--引用类型");
		System.out.println("原有的值：" + t.value);//0
		// 改变基本类型参数的值
		t.add(t.value);
		System.out.println("赋引用后：" + t.value);//0
		// 改变引用类型参数所指向对象的属性值
		t.add(t);
		System.out.println("改属性后：" + t.value);//8
	}

}
