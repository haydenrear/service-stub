package com.hayden.servicestub.servicestubautoconfigure;

import com.hayden.servicestublibrarytwo.ServiceStubbed;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ServiceStubbed.class)
public class ServiceStubConfig {

    @Bean
    ServiceStubbed serviceStubbed()
    {
        return new ServiceStubbed();
    }

}
