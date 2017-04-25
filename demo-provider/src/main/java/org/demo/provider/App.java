package org.demo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("org.demo.provider.*.mapper")
@ImportResource("classpath:/META-INF/spring/*.xml")
public class App 
{
	
//	@Bean
//	public HttpMessageConverters fastJsonHttpMessageConverters(){
//		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		fastConverter.setFastJsonConfig(fastJsonConfig);
//		HttpMessageConverter<?> converter = fastConverter;
//		return new HttpMessageConverters(converter);
//	}
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
