package ru.htccs.den.springboottest.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import ru.htccs.den.springboottest.models.News;
import ru.htccs.den.springboottest.repository.INewsRepository;

import java.util.concurrent.Callable;

@Service
public class NewsService {
    private final INewsRepository repository;
    private final Scheduler scheduler;
    public NewsService(INewsRepository inRepository, @Qualifier("jdbcScheduler") Scheduler inScheduler) {
        this.repository = inRepository;
        this.scheduler = inScheduler;
    }
    public Mono<Iterable<News>> findAll() {
        return async(() -> repository.findAll());
    }
    private <T> Mono<T> async(Callable<T> callable) {
        return Mono.fromCallable(callable).publishOn(scheduler);
    }
}
