package Singleton_Pattern;


/*
 *单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类成为单例类，它提供全局访问的方法。
 *三个要点：
 *1.某个类只能有一个实例
 *2.它必须自行创建这个实例
 *3.它必须自行向整个系统提供这个实例
 *
 *为了防止在外部对其实例化，可以讲类的构造函数设计为私有类，在单例类内部定义一个Singleton类型的静态对象，作为外部共享的唯一实例
 */
public class Client {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println( s1==s2 );

	}

}
