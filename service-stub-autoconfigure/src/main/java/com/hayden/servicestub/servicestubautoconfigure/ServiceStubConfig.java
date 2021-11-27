package com.hayden.servicestub.servicestubautoconfigure;

import com.hayden.servicestublibrarytwo.ServiceStubWiring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceStubConfig {

    @Bean
    ServiceStubWiring serviceStubbed()
    {
        return new ServiceStubWiring();
    }

}
