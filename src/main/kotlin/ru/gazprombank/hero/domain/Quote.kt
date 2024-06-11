package ru.gazprombank.hero.domain

import ru.gazprombank.hero.config.QuotesConfig
import kotlin.random.Random

class Quote(
    private val quotesConfig: QuotesConfig
) {

    fun saidQuote() =
        quotesConfig.quotes[Random.nextInt(0, quotesConfig.quotes.size)]


    companion object {

        fun emerge(quotesConfig: QuotesConfig) = Quote(quotesConfig)

    }
}