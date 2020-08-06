package designCode.factory.simpleFactory;

import designCode.factory.service.ICourse;
import designCode.factory.service.impl.JavaCourse;
import designCode.factory.service.impl.PythonCourse;

public class SimpleFactoryTest {
public static void main(String args[]) throws Exception {

	CourseFactory courseFactory=new CourseFactory();
	ICourse course=courseFactory.createByClass(JavaCourse.class);
	course.record();

	course=courseFactory.createByClass(PythonCourse.class);
	course.record();

}

}

