package ru.htccs.den.springboottest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Конфигурирование приложения с помошью сопоставления путей с отображением
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("welcomePage");
        registry.addViewController("/welcome").setViewName("welcomePage");
        //registry.addViewController("/main").setViewName("main");
        //registry.addViewController("/login").setViewName("login");
    }
}
