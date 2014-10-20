package info.zoio.tec.java.basics.d141020.final_;

/**
 * finally的使用示例说明
 * 注：finally一般和try...catch一起使用
 *
 * @author humyna
 *
 */
public class FinallyTest {
	public static void main(String[] args) {
		finallyTest1();
		System.out.println();

		finallyTest2();
		System.out.println();

		finallyTest3();
	}

	private static String finallyTest1(){
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("Finally1-a语句被执行");
		}

		try {
			System.out.println("Hello World");
			return "Hello World";
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("Finally1-b语句被执行");
		}

		return null;
	}

	private static void finallyTest2(){
		for (int i = 0; i < 3; i++) {
			try {
				if( i == 1)break;
				System.out.println(i);
			}  finally{
				System.out.println("Finally2语句被执行");
			}
		}
	}

	private static String finallyTest3(){
		try {
			return null;
		}  finally{
			System.out.println("Finally3语句被执行");
		}
	}
}
