package my_demo.tx.dynamicdatasource;


import my_demo.tx.dynamicdatasource.config.MyRootConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyRootConfig.class);
		BusinessService testService = ac.getBean(BusinessService.class);
		testService.test("1001");
	}
}
