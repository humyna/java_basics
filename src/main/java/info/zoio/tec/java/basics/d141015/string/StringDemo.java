package info.zoio.tec.java.basics.d141015.string;

/**
 * 类说明
 * 1.JVM对字符串的缓存方式
 * 2.数组的初始化方式
 * 3.字符串的反转
 * 4.字符串和char数组的相互转换
 *
 * @author humyna
 *
 */
public class StringDemo {
	private static final String constValue= "ab";//编译时常量
	private static final String staticValue;//运行时常量

	static
	{
		staticValue = "ab";
	}

	public static void main(String[] args) {
		String v= "abcdefg";
		char[] charAry = v.toCharArray();
		char[] charTmp = new char[charAry.length] ;//数组的初始化有三种：char cha[] = {'a','2','3','f'}; （2）char[]  cha=  new char[]{'a','2','3','f'};（3）char[]  cha=  new char[4]；cha[0]='a';cha[1]='2';..

		//字符串反转
		for (int i = 0; i < charAry.length; i++) {
			charTmp[charAry.length - 1 - i] = charAry[i];
		}
		System.out.println(new String(charTmp) + " " + String.valueOf(charTmp));//char数组转String的两种方法

		//以下主要为了说明JVM对字符串的缓存方式
		//1.JVM只能缓存那些在编译时可以确定的常量，而非运行时常量(constValue属于编译时常量，而staticValue则属于运行时常量)
		//2.通过使用 new方式创建出来的字符串，JVM缓存的方式是不一样的(v1不等同于v3)
		String v1 = "ab";
        String v2 = "ab";
        System.out.println("v1 == v2 : " + (v1 == v2));//字符串池
        String v3 = new String("ab");
        System.out.println("v1 == v3 : " + (v1 == v3));
        String v4 = "abcd";
        String v5 = "ab" + "cd";
        System.out.println("v4 == v5 : " + (v4 == v5));
        String v6 = v1 + "cd";
        System.out.println("v4 == v6 : " + (v4 == v6));
        String v7 = constValue + "cd";
        System.out.println("v4 == v7 : " + (v4 == v7));
        String v8 = staticValue + "cd";
        System.out.println("v4 == v8 : " + (v4 == v8));
        String v9 = v4.intern();
        System.out.println("v4 == v9 :" + (v4 == v9));
        String v10 = new String(new char[]{'a','b','c','d'});
        String v11 = v10.intern();
        System.out.println("v4 == v11 :" + (v4 == v11));
        System.out.println("v10 == v11 :" + (v10 == v11));
	}
}
