package com.code.app.chapter1.base

/**
 * @ClassName BaseGrammar01
 * @Author: Lary.huang
 * @CreateDate: 2020/9/21 5:03 PM
 * @Version: 1.0
 * @Description: TODO
 */
class Book(val name: String)

fun main(args: Array<String>) {
    val getBook = ::Book
    println(getBook("Dive into Kotlin").name)

    val bookName = listOf<Book>(
        Book("Thinking in Java"),
        Book("Dive into Kotlin")
    ).map(Book::name)
    println(bookName)
}