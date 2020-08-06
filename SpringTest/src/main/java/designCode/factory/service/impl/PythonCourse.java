package designCode.factory.service.impl;

import designCode.factory.service.ICourse;

public class PythonCourse implements ICourse {
	@Override
	public void record() {
	 System.out.println("录制Python course");
	}
}
