package designCode.factory.factorymethod.impl;

import designCode.factory.factorymethod.ICourseFactory;
import designCode.factory.service.ICourse;
import designCode.factory.service.impl.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
	@Override
	public ICourse createCourse() {
		return new JavaCourse();
	}
}
