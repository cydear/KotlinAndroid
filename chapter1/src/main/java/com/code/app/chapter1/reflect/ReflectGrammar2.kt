package com.code.app.chapter1.reflect

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties

/**
 * @ClassName ReflectGrammar1
 * @Author: Lary.huang
 * @CreateDate: 2020/9/23 11:54 AM
 * @Version: 1.0
 * @Description: TODO
 */
data class Person(var name: String, var age: Int, var address: String)

fun KMutablePropertyShow() {
    val p = Person("疾跑科技", 18, "shanghai")
    val props = p::class.memberProperties
    for (prop in props) {
        when (prop) {
            is KMutableProperty<*> -> prop.setter.call(p, "hefei")
            else -> prop.call(p)
        }
    }
    println(p.address)
}

fun main(args: Array<String>) {
    KMutablePropertyShow()
}