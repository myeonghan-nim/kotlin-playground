package playground

import kotlin.text.*

fun main() {
    println("Hello, Kotlin!")

    val a: Int = 1
    val b = 2
    val c: Int
    c = 3

    var x = 5
    x += 1

    fun useVariables() {
        println("Sum of variables: ${a + b + c + x}")
    }

    val rectangle = Rectangle(3.0, 4.0)
    println("Perimeter is ${rectangle.perimeter}")

    // Single line comment
    /*
    Multi line comment
    */

    val s1 = "x is $x"
    x += 1
    val s2 = "${s1.replace("is", "was")}, but now is $x"
    println(s2)

    if (a > b) {
        println("a win")
    } else {
        println("b win")
    }
    if (b > c) println("b win") else println("c win")

    val items = listOf("apple", "banana", "coke")
    for (idx in items.indices) {
        println("Item at $idx is ${items[idx]}")
    }
    for (item in items) {
        println(item)
    }

    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    fun convert(obj: Any): String =
            when (obj) {
                1 -> "Int"
                "1" -> "String"
                true -> "Bool"
                else -> "Unknown"
            }

    if (1 in 1..5) {
        println("fit")
    }
    if (-1 !in 0..2) {
        println("out of range")
    }

    for (i in 1..10 step 2) {
        println(i)
    }
    for (i in 9 downTo 0 step 3) {
        println(i)
    }

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }.sortedBy { it }.map { it.uppercase() }.forEach {
        println(it)
    }

    fun parseInt(str: String): Int? {
        return str.toInt()
    }
    fun printProduct(arg1: String, arg2: String) {
        val a1 = parseInt(arg1)
        val a2 = parseInt(arg2)

        if (a1 != null && a2 != null) {
            println(a1 * a2)
        } else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) return obj.length
        return null
    }
}

fun basicSum(a: Int, b: Int): Int {
    return a + b
}

fun shortSum(a: Int, b: Int) = a + b

fun unitSum(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

fun omittedUnitSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

open class Shape

class Rectangle(val width: Double, val height: Double) : Shape() {
    val perimeter = (width + height) * 2
}
