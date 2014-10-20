package info.zoio.tec.java.basics.d141020.final_;

/**
 *
 * final的使用示例说明
 *
 * 1、final可以修饰类、成员变量、方法和方法参数
 * 2、final修饰的类是不可以被继承的
 *   final修饰的方法是不可以被重写的
 *   final修饰的变量只能被赋值一次
 * 3、使用final声明变量的赋值时机
 * 		定义声明是赋值
 * 		初始化块或静态初始化块
 * 		构造函数
 *
 * @author humyna
 *
 */
public class FinalTest {
	private static final String staticVar = "静态变量";
	private static final String staticVar2;

	static
	{
		staticVar2 = "静态变量2";
	}

	private final String instanceVar = "实例变量";
	private final String instanceVar2;
	private final String instanceVar3;

	{
		instanceVar2 = "实例变量2";
	}

	public FinalTest(){
		instanceVar3 = "实例变量3";
	}
}
