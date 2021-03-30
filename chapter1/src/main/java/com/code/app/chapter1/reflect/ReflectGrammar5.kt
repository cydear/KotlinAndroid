package com.code.app.chapter1.reflect

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.functions

/**
 * @ClassName ReflectGrammar5
 * @Author: Lary.huang
 * @CreateDate: 2020/9/24 4:50 PM
 * @Version: 1.0
 * @Description: TODO
 */
class Person1 {
    var name: String? = null
    var age: Int = 0

    //成员函数
    fun setNameAndAage(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "Person1 [name=$name , age=$age ]"
    }
}

//Person1的扩展函数
fun Person1.getNameAndAge() = "name=$name,age=$age"

fun main(args: Array<String>) {
    val clazz = Person1::class
    //创建Person1实例
    val person = clazz.createInstance()
    //输出方法名

    clazz.functions.forEach {
        println(it.name)
    }
    //KClass提供的API获得Function实例
    val pfn1 = clazz.functions.first()
    pfn1.call(person, "Tom", 20)
    println(person)

    val pfn2 = Person1::setNameAndAage

    pfn2(person, "Tony", 30)
    println(person)

    val pfn3 = Person1::getNameAndAge
    println(pfn3(person))

    val clz = Class.forName("com.code.app.chapter1.reflect.Person1").kotlin
    val functions=clz.functions
}