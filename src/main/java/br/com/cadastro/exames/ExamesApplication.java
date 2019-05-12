package br.com.cadastro.exames;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import br.com.cadastro.exames.service.ExameService;
 
@SpringBootApplication
public class ExamesApplication extends SpringBootServletInitializer implements ApplicationRunner{
     
    @Autowired
    private ExameService exameService;
     
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ExamesApplication.class);
    }
     
    public static void main(String[] args) {
        SpringApplication.run(ExamesApplication.class, args);
    }
 
    @Bean
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setUrlPatterns(getRootPathUrls());
        registrationBean.setFilter(struts);
        registrationBean.setOrder(1);
        return registrationBean;
    }
    
    private List<String> getRootPathUrls() {
        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        return urlPatterns;
    }
 
    @Override
    public void run(ApplicationArguments args) throws Exception {
    	exameService.insertBatch();
    }
    
}
