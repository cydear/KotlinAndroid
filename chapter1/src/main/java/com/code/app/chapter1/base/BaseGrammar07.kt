package com.code.app.chapter1.base

/**
 * @ClassName BaseGrammar07
 * @Author: Lary.huang
 * @CreateDate: 2020/9/22 11:26 AM
 * @Version: 1.0
 * @Description: TODO 中缀表达式
 */

class Person {
    infix fun called(name: String) {
        println("My name is ${name}")
    }
}

fun main(args: Array<String>) {
    val p = Person()
    p called "Tom"
}