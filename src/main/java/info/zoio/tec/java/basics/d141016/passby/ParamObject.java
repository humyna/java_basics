package info.zoio.tec.java.basics.d141016.passby;

public class ParamObject {
	protected int value = 0;

	// 为方法参数重新赋值
	public void change(int i){
		i = 8;
	}

	// 为方法参数重新赋值
	public void change(ParamObject obj) {
		ParamObject tmp = new ParamObject();
		tmp.value = 12;
		obj = tmp;
	}

	// 改变方法参数的值
	public void add(int i){
		i += 8;
	}

	// 改变方法参数属性的值
	public void add(ParamObject obj){
		obj.value += 8;
	}
}
