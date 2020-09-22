package com.code.app.chapter1.base

/**
 * @ClassName BaseGrammar05
 * @Author: Lary.huang
 * @CreateDate: 2020/9/21 7:22 PM
 * @Version: 1.0
 * @Description: TODO
 */
fun main(args: Array<String>) {
    val maybeInt: Int? = null
    println(maybeInt ?: 1)
    schedule(true, Day.SAT)
}

enum class Day(val day: Int) {
    MON(1),
    TUE(2),
    WEN(3),
    THU(4),
    FRI(5),
    SAT(6),
    SUN(7);

    fun getDayNumber(): Int {
        return day;
    }
}

fun schedule(sunny: Boolean, day: Day) = when (day) {
    Day.SAT -> basketball(day)
    Day.SUN -> fishing(day)
    Day.FRI -> appointment(day)
    else -> when {
        sunny -> library(day, sunny)
        else -> study(day, sunny)
    }
}

val basketball = { day: Day ->
    println("今天星期${day.getDayNumber()},我去打篮球了")
}

val fishing = { day: Day ->
    println("今天星期${day.getDayNumber()},我去钓鱼了")
}

val appointment = { day: Day ->
    println("今天星期${day.getDayNumber()},我去约会了")
}

val library = { day: Day, sunny: Boolean ->
    println("今天星期${day.getDayNumber()},天气${if (sunny) "晴朗" else "下雨"},我去图书馆")
}

val study = { day: Day, sunny: Boolean ->
    println("今天星期${day.getDayNumber()},天气${if (sunny) "晴朗" else "下雨"},我在寝室学习")
}

