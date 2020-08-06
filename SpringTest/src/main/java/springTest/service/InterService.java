package springTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tanyanwen
 * @since 2020/8/4 9:08 下午
 */
@Service
public class InterService {

	@Autowired
	MemberService memberService;

	public  InterService(){
		System.out.println("InterService");
	}
	public MemberService getMemberService() {
		return memberService;
	}
}

