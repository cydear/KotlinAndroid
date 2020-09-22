package com.code.app.chapter1.objects

/**
 * @ClassName ObjectGrammar01
 * @Author: Lary.huang
 * @CreateDate: 2020/9/22 2:43 PM
 * @Version: 1.0
 * @Description: TODO
 */
class Price(val name: String, val count: Int, val type: Int) {
    companion object {
        val TYPE_REDPACK = 0
        val TYPE_COUPON = 1

        fun isRedpack(price: Price): Boolean {
            return price.type == TYPE_REDPACK
        }
    }
}