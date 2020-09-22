package com.code.app.chapter1.objects

/**
 * @ClassName ObjectGrammar01
 * @Author: Lary.huang
 * @CreateDate: 2020/9/22 2:43 PM
 * @Version: 1.0
 * @Description: TODO
 */
interface Flyer {
    fun fly()
    fun kind() = "[Flyer] flying animals"
}

interface Animal {
    val name: String
    fun eat()
    fun kind() = "[Animal] flying animals"
}

class Bird(override val name: String) : Flyer, Animal {
    override fun fly() {
        TODO("Not yet implemented")
        val arrays = Array(5) { i -> (i * 4) }
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun kind() = super<Flyer>.kind()
}