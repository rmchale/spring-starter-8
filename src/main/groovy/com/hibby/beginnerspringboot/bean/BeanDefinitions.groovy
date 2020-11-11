package com.hibby.beginnerspringboot.bean

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanDefinitions {
    @Bean /* definition for MyBean class */
    MyBean bean() {
        return new MyBean();
    }
}
