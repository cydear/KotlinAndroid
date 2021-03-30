package com.code.app.chapter1.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @ClassName KotlinCoroutines1
 * @Author: Lary.huang
 * @CreateDate: 2020/9/23 4:19 PM
 * @Version: 1.0
 * @Description: TODO
 */
fun main(args: Array<String>) {
    test1()
}

/**
 * 启动一个协程
 */
fun test1() {
    GlobalScope.launch {
        delay(1000L)
        print("World")
    }
    print("Hello,")
    Thread.sleep(2000L)
}

suspend fun searchItemOne(): String {
    delay(100L)
    return "item-one"
}

suspend fun searchItemTwo(): String {
    delay(100L)
    return "item-two"
}