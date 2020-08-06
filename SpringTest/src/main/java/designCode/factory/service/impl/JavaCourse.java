package designCode.factory.service.impl;

import designCode.factory.service.ICourse;

public class JavaCourse implements ICourse {
	@Override
	public void record() {
	 System.out.println("录制java course");
	}
}
