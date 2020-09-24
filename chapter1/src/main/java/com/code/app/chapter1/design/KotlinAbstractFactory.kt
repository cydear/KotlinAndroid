package com.code.app.chapter1.design

/**
 * @ClassName KotlinAbstractFactory
 * @Author: Lary.huang
 * @CreateDate: 2020/9/23 3:39 PM
 * @Version: 1.0
 * @Description: TODO
 */
interface ComputerA

class Dell : ComputerA
class Asus : ComputerA
class Acer : ComputerA

class DellComputer : AbstractFactory() {
    override fun produce() = Dell()
}

class AsusComputer : AbstractFactory() {
    override fun produce() = Asus()
}

class AcerComputer : AbstractFactory() {
    override fun produce() = Acer()
}

abstract class AbstractFactory {
    abstract fun produce(): ComputerA

//    companion object {
//        operator fun invoke(factory: AbstractFactory): AbstractFactory {
//            return factory
//        }
//    }

    companion object {
        inline operator fun <reified T : ComputerA> invoke(): AbstractFactory =
            when (T::class) {
                Dell::class -> DellComputer()
                Asus::class -> AsusComputer()
                Acer::class -> AcerComputer()
                else -> throw IllegalArgumentException()
            }
    }
}

fun main(args: Array<String>) {
    val dellFactory = AbstractFactory<Dell>()
    val dell = dellFactory.produce();
    println("computer => ${dell}")
}