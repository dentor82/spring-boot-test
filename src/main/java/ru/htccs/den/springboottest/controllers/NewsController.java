package ru.htccs.den.springboottest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.htccs.den.springboottest.models.News;
import ru.htccs.den.springboottest.repository.INewsRepository;
import ru.htccs.den.springboottest.service.NewsService;

/**
 * Контроллер для вывода новостей
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    private NewsService newsRepository;

    public NewsController(NewsService inRepository) {
        this.newsRepository = inRepository;
    }

    @GetMapping
    public Mono<Iterable<News>> findAll(Model model) {
        Mono<Iterable<News>> retValue = newsRepository.findAll();
        model.addAttribute("news", retValue.block());
        return retValue;
    }
}
