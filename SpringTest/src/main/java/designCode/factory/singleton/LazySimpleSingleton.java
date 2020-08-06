package designCode.factory.singleton;

/**
 * 懒汉式
 *
 * 线程不安全
 */
public class LazySimpleSingleton {

	private static LazySimpleSingleton lazySimpleSingleton;
	private LazySimpleSingleton(){

	}
	//JDK1.6之后synchronized性能优化不少
	//不可避免地还是存在一定的性能问题
	public synchronized static LazySimpleSingleton getInstance(){
		if(lazySimpleSingleton==null){
			lazySimpleSingleton=new LazySimpleSingleton();
		}
		return lazySimpleSingleton;
	}
}
