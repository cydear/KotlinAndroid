package com.code.app.chapter1.reflect

import kotlin.reflect.KFunction2

/**
 * @ClassName ReflectGrammar4
 * @Author: Lary.huang
 * @CreateDate: 2020/9/24 4:34 PM
 * @Version: 1.0
 * @Description: TODO
 */
fun sum(x: Int, y: Int): Int = x + y

fun main(args: Array<String>) {
    val sumFun: (Int, Int) -> Int = ::sum
    println("sumFun=>${sumFun(1, 2)}")

    //一个函数类型的变量（函数引用）属于KFunction<out R> 的子类型
    val kFunction2: KFunction2<Int, Int, Int> = ::sum
    println("kFunction2=>${kFunction2.invoke(1, 2) + kFunction2(3, 4)}")

    //KFunction接口继承自KCallable和Function
    val sumFun2 = ::sum

    println(sumFun2.call(3, 6))
    println(sumFun2.invoke(2, 5))
    //会被编译成sumFun2.invoke(1,3)
    println(sumFun2(1, 3))
}