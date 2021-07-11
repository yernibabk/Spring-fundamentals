import java.util.Calendar;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pluralsight.repository.HibernateSpeakerImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.util.CalendarFactory;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
	
	@Bean(name="cal")
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);
		return factory;
	}
	
	
	@Bean
	public Calendar cal() throws Exception {
		return calFactory().getObject();
	}
	
	/*@Bean("speakerService")
	@Scope(value= BeanDefinition.SCOPE_SINGLETON)
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		//SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
		//service.setRepository(getSpeakerRepository());
		return service;
	}
	
	@Bean("speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerImpl();
	} */

}
