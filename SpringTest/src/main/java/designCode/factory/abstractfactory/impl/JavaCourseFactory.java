package designCode.factory.abstractfactory.impl;

import designCode.factory.abstractfactory.ICourceAbstractFactory;
import designCode.factory.abstractfactory.INote;
import designCode.factory.abstractfactory.IRecordVideo;
import designCode.factory.service.ICourse;
import designCode.factory.service.impl.JavaCourse;

public class JavaCourseFactory implements ICourceAbstractFactory {
	@Override
	public ICourse createCource() {
		return new JavaCourse();
	}
	@Override
	public INote createNote() {
		return new NoteImpl();
	}

	@Override
	public IRecordVideo createRecord() {
		return new RecordVideoImpl();
	}
}
