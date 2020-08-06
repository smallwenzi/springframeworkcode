package springTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("springTest")
@Configuration
public class AppConfig {
	public static void main(String[] args){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//MemberService memberService=annotationConfigApplicationContext.getBean(MemberService.class);
		//System.out.println(memberService.getInterService());
	}
}