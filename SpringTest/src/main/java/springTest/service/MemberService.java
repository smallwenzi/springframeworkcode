package springTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	InterService interService;

	public MemberService(){
		System.out.println("MemberService");

	}
	public InterService getInterService(){
		return interService;
	}
}
