package designCode.factory.simpleFactory;

import designCode.factory.service.ICourse;

public class CourseFactory {

	public ICourse createByClass(Class<? extends  ICourse> clazz) throws Exception {
		if(clazz==null){
			throw new NullPointerException("clazz is null");
		}
		return clazz.newInstance();
	}
}
