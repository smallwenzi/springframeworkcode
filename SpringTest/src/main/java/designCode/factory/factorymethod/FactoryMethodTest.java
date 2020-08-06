package designCode.factory.factorymethod;

import designCode.factory.factorymethod.impl.JavaCourseFactory;
import designCode.factory.factorymethod.impl.PythonCourseFactory;
import designCode.factory.service.ICourse;

public class FactoryMethodTest {
	public static void main(String args[]){
		ICourseFactory courseFactory=new PythonCourseFactory();
		ICourse course=courseFactory.createCourse();
		course.record();
		courseFactory=new JavaCourseFactory();
		course=courseFactory.createCourse();
		course.record();
	}
}
