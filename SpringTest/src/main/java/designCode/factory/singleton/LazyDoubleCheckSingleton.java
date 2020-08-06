package designCode.factory.singleton;

/**
 * 懒汉式
 *
 * 线程安全 双重检查
 */
public class LazyDoubleCheckSingleton {

	private volatile  static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;
	private LazyDoubleCheckSingleton(){

	}
	//适中方案
	public  static LazyDoubleCheckSingleton getInstance(){
		if(lazyDoubleCheckSingleton==null){
			synchronized (LazyDoubleCheckSingleton.class) {
				if(lazyDoubleCheckSingleton==null) {
					lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
				//CPU执行时候会转换成JVM指令
					//指令重排序volatile
					//1分配内存给这个对象
					//2 初始化对象
					//3.将初始化好的对象和内存地址是建立管理 赋值
					//4.用户初次访问
				}
			}
		}
		return lazyDoubleCheckSingleton;
	}
}
