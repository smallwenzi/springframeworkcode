package designCode.factory.factorymethod.impl;

import designCode.factory.factorymethod.ICourseFactory;
import designCode.factory.service.ICourse;
import designCode.factory.service.impl.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
	@Override
	public ICourse createCourse() {
		return new PythonCourse();
	}
}
