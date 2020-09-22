package com.code.app.chapter1.base

/**
 * @ClassName BaseGrammar03
 * @Author: Lary.huang
 * @CreateDate: 2020/9/21 6:03 PM
 * @Version: 1.0
 * @Description: TODO
 */
data class Country(
    val name: String,
    val continient: String,
    val population: Int
)

class CountryApp {
    fun filterCountries(countries: List<Country>, test: (Country) -> Boolean): List<Country> {
        val res = mutableListOf<Country>();
        for (c in countries) {
            if (test(c)) {
                res.add(c)
            }
        }
        return res
    }
}

fun main(args: Array<String>) {
    val countryApp = CountryApp()
    val countries = listOf<Country>(
        Country("11", "33", 100)
    )
    val results = countryApp.filterCountries(countries, fun(country: Country): Boolean {
        return country.continient == "33" && country.population > 50
    })

    println(results)
}