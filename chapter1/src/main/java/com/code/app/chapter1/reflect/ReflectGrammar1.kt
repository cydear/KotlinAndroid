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
object Mapper {
    fun <A : Any> toMap(a: A): Map<String, Any?> {
        return a::class.memberProperties.map { m ->
            val p = m as KMutableProperty<*>
            p.name to p.call(a)
        }.toMap()
    }
}

data class User(var name: String, var age: Int)

fun main(args: Array<String>) {
    val user = User("tome", 18)
    val map = Mapper.toMap(user)
    println(map.toString())
}