package ru.htccs.den.springboottest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Конфигурирование приложения с помошью сопоставления путей с отображением
 */
@EnableWebMvc
@Configuration
public class MVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("welcomePage");
        registry.addViewController("/welcome").setViewName("welcomePage");
        registry.addViewController("/news").setViewName("news");
        //registry.addViewController("/login").setViewName("login");
    }
}
