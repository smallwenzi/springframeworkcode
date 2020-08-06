package designCode.factory.singleton;

/**
 * 加载LazyInnerClassSingleton 前
 * 先加载内部类
 *
 * 全程没有用到synchronized
 * 性能最优的一种写法
 *
 * 理解内部类执行逻辑
 */
public class LazyInnerClassSingleton {

	private LazyInnerClassSingleton(){
		if(LazyHolder.LAZY!=null){
			throw new RuntimeException("不允许构建多个实例");
		}
	}

	//懒汉式单例
	//LazyHolder里面的逻辑需要等到外部方法条勇士才知晓
	//巧妙利用了内部类的特性
	//JVM 底层执行逻辑， 完美低避免了线程安全问题
	public static final LazyInnerClassSingleton getIntance(){
		return LazyHolder.LAZY;
	}

	private static class LazyHolder{
		private static final LazyInnerClassSingleton LAZY=new LazyInnerClassSingleton();
	}
}
