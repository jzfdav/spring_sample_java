import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jzf.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// CustomerService service = new CustomerServiceImpl();

		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service);

		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service2);

		System.out.println(service.findAll().get(0).getFirstName());

		appContext.close();

	}

}
