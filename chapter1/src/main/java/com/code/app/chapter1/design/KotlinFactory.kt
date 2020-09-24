package com.code.app.chapter1.design

/**
 * @ClassName KotlinFactory
 * @Author: Lary.huang
 * @CreateDate: 2020/9/23 3:22 PM
 * @Version: 1.0
 * @Description: TODO 工厂设计模式
 */
interface Computer {
    val cpu: String

    companion object Factory {
        operator fun invoke(type: ComputerType): Computer {
            return when (type) {
                ComputerType.PC -> PC()
                ComputerType.Server -> Server()
            }
        }
    }
}

class PC(override val cpu: String = "Core") : Computer
class Server(override val cpu: String = "Xeon") : Computer

enum class ComputerType {
    PC, Server
}

//object ComputerFactory {
//    fun produce(type: ComputerType): Computer {
//        return when (type) {
//            ComputerType.PC -> PC()
//            ComputerType.Server -> Server()
//        }
//    }
//}

//object ComputerFactory {
//    operator fun invoke(type: ComputerType): Computer {
//        return when (type) {
//            ComputerType.PC -> PC()
//            ComputerType.Server -> Server()
//        }
//    }
//}

fun main(args: Array<String>) {
    //val computer = ComputerFactory.produce(ComputerType.PC)
    //val computer = ComputerFactory(ComputerType.PC)
    val computer = Computer.Factory(ComputerType.PC)
    println("Computer Type => ${computer.cpu}")
}