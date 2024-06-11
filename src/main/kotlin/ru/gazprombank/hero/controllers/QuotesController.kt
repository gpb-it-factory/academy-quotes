package ru.gazprombank.hero.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import ru.gazprombank.hero.service.QuotesService


@RestController
class QuotesController(
    private val quotesService: QuotesService
) {


    @GetMapping("/quote")
    fun getEmployeeById(): Mono<ResponseEntity<String>> {
        return quotesService.saidQuote()
    }

}