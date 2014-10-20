package info.zoio.tec.java.basics.d141020.final_;

/**
 * 说明：需要多执行几次，不然可能看不到打印结果
 *
 * @author humyna
 *
 */
public class FinalizeTest {
	protected void finalize(){
		System.out.println("finalize方法被调用");
	}

	public static void main(String[] args) {
		FinalizeTest finalizeTest = new FinalizeTest();
		finalizeTest = null;

		Runtime.getRuntime().gc();
	}
}
