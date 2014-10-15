package info.zoio.tec.java.basics.d141015.classinitseq;

/**
 * 验证类的初始化顺序
 *
 * @author humyna
 * @date 2014-10-15
 *
 */
public class ClassInitSeqParent {
	private static StaticVar pStaticVar1 = new StaticVar("父类-静态变量1");
	private StaticVar staticVar1 = new StaticVar("父类-普通变量1");

	static{
		System.out.println("父类-静态代码块");
	}

	{
		System.out.println("父类-代码块");
	}
	public ClassInitSeqParent() {
		System.out.println("父类-构造函数");
	}

	private static StaticVar pStaticVar2 = new StaticVar("父类-静态变量2");
	private StaticVar staticVar2 = new StaticVar("父类-普通变量2");

}
