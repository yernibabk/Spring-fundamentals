import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//run the application with vm options: -Dspring.profiles.active=dev
    	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        //SpeakerService speakerService = new SpeakerServiceImpl();
    	SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
    	//System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.print(service.findAll().get(0).getSeedNum());
        //SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
    	//System.out.println(service2);
    }
}
