package info.zoio.tec.java.basics.d141015.classinitseq;

public class ClassInitSeqChild extends ClassInitSeqParent{
	private static StaticVar cStaticVar1 = new StaticVar("子类-静态变量1");
	private StaticVar staticVar1 = new StaticVar("子类-普通变量1");

	static{
		System.out.println("子类-静态代码块");
	}

	{
		System.out.println("子类-代码块");
	}
	public ClassInitSeqChild() {
		System.out.println("子类-构造函数");
	}

	private static StaticVar cStaticVar2 = new StaticVar("子类-静态变量2");
	private StaticVar staticVar2 = new StaticVar("子类-普通变量2");
}
