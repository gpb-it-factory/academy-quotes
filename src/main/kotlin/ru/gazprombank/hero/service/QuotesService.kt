package ru.gazprombank.hero.service

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import ru.gazprombank.hero.config.QuotesConfig
import ru.gazprombank.hero.domain.Quote

@Service
class QuotesService(
    private val quotesConfig: QuotesConfig
) {

    fun saidQuote(): Mono<ResponseEntity<String>> =
        Mono.just(ResponseEntity.ok().body(Quote.emerge(quotesConfig).saidQuote()))
}