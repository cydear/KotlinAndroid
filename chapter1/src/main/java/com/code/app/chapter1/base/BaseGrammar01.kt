package com.code.app.chapter1.base

/**
 * @ClassName BaseGrammar01
 * @Author: Lary.huang
 * @CreateDate: 2020/9/21 5:03 PM
 * @Version: 1.0
 * @Description: TODO
 */
fun test1() {
    val string = "I am kotlin"
    val int = 1234
    val long = 12234L
    val float = 2233f
    val double = 12.34
    val double2 = 10.14e6
    println(string.javaClass.name)
    println(int.javaClass.name)
    println(long.javaClass.name)
    println(float.javaClass.name)
    println(double.javaClass.name)
    println(double2.javaClass.name)
}

fun sum(x: Int, y: Int): Int = x + y

fun max(x: Int, y: Int): Int = if (x > y) x else y

fun foo(n: Int): Int = if (n == 0) 1 else n * foo(n - 1)

fun foo1(x: Int) {
    fun double(y: Int): Int {
        return y * 2;
    }
    println(double(x))
}

fun main(args: Array<String>) {
    foo1(5)
}

/**
 * 高级函数
 */
fun caculate(x: Int, y: Int, add: ((Int, Int) -> Int)) {
    val result = add(x, y)
    println(result)
}