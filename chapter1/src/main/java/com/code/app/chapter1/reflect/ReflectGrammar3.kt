package com.code.app.chapter1.reflect

/**
 * @ClassName ReflectGrammar3
 * @Author: Lary.huang
 * @CreateDate: 2020/9/24 4:15 PM
 * @Version: 1.0
 * @Description: TODO
 */
fun isOdd(x: Int) = x % 2 != 0

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)
    println(numbers.filter(::isOdd))
}