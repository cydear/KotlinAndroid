package com.code.app.chapter1.base

/**
 * @ClassName BaseGrammar05
 * @Author: Lary.huang
 * @CreateDate: 2020/9/21 7:22 PM
 * @Version: 1.0
 * @Description: TODO
 */
fun main(args: Array<String>) {
    curryingLike("looks like currying style") { it ->
        println(it)
    }
}

fun curryingLike(content: String, block: (String) -> Unit) {
    block(content)
}