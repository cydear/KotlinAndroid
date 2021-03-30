package com.code.app.chapter1.reflect2

import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.full.*
import kotlin.reflect.jvm.javaConstructor

/**
 * @ClassName KotlinReflect1
 * @Author: Lary.huang
 * @CreateDate: 2020/9/25 11:10 AM
 * @Version: 1.0
 * @Description: TODO 反射
 */

class Person(var name: String, var age: Int, var address: String) {
    fun display() {
        println("用户信息=>[ name=${name} , age=${age} , address=${address} ]")
    }

    fun display(title: String) {
        println("用户信息:${title}=>[ name=${name} , age=${age} , address=${address} ]")
    }

    private fun sayHello() {
        println("hello")
    }

    fun sayHello(name: String, content: String) {
        println("$name say $content")
    }
}

fun main(args: Array<String>?) {
    val p = Person("tome", 18, "sh")
    val clazz = p::class
    val memebers = clazz.members
    println("===================memebers start=====================")
    memebers.forEach {
        println(it.name)
    }
    println("===================declaredMembers start=====================")
    val declaredMembers = clazz.declaredMembers
    declaredMembers.forEach {
        println(it.name)
    }
    println("===================constructors start=====================")
    var constructors = clazz.constructors
    constructors.forEach {
        println(it.name)
    }
    println("===================functions start=====================")
    val functions = clazz.functions
    functions.forEach {
        println(it.name)
    }
    println("===================declaredMemberFunctions start=====================")
    val declaredMemberFunctions = clazz.declaredMemberFunctions
    declaredMemberFunctions.forEach {
        println(it.name)
    }
    println("===================declaredMemberProperties start=====================")
    val declaredMemberProperties = clazz.declaredMemberProperties
    declaredMemberProperties.forEach {
        println(it.name)
    }
    println("===================declaredMemberExtensionProperties start=====================")
    val declaredMemberExtensionProperties = clazz.declaredMemberExtensionProperties
    declaredMemberExtensionProperties.forEach {
        println(it.name)
    }
    println("===================自定义反射区域=====================")
    //查询方法
    val memederFunctions = clazz.declaredMemberFunctions
    val display = memederFunctions.find {
        it.name == "display"
    }
    println("display =>" + display?.name)
    val paramsType = arrayOf(String::class.java)
    val displayMethod = clazz.java.getDeclaredMethod("display", *paramsType)
    println("displayMethod =>" + displayMethod.name)
    val sayParamsType = arrayOf(String::class.java, String::class.java)
    val sayHelloMethod = clazz.java.getDeclaredMethod("sayHello", *sayParamsType)
    sayHelloMethod.invoke(p, "tom", "hello every one")
}