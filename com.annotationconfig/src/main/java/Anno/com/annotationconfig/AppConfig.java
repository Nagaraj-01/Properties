package Anno.com.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public samsung getPhone() {
		return new samsung();
	}
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragan();
	}
	@Bean
	public redmi getmi()
	{
		return new newbrand();
	}
}
