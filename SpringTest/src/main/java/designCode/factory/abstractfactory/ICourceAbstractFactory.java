package designCode.factory.abstractfactory;

import designCode.factory.service.ICourse;

/**
 * 课程工厂
 */
public interface ICourceAbstractFactory {

	ICourse createCource();
	INote createNote();
	IRecordVideo createRecord();
}
