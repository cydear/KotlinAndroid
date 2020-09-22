package com.code.app.chapter1.base

/**
 * @ClassName BaseGrammar04
 * @Author: Lary.huang
 * @CreateDate: 2020/9/21 6:48 PM
 * @Version: 1.0
 * @Description: TODO
 */
fun foo2(x: Int) = print("$x ")

fun main(args: Array<String>) {
    listOf<Int>(1, 2, 3, 4, 5).forEach {
        foo2(it)
    }

    println(foo3(2, 5))

    println(foo3(6)(7))

    println(foo4(1)(2)(3))

    omitParentheses { println("omitParentheses 12345") }
}

val foo3 = { x: Int, y: Int -> x + y }

fun foo3(x: Int) = { y: Int -> x + y }

fun foo4(x: Int) = { y: Int ->
    { z: Int ->
        x + y + z
    }
}

fun omitParentheses(block: () -> Unit) {
    block();
}