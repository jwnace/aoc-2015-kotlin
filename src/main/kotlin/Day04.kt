import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

fun main() {
    val input = File("input/day04.txt").readText()

    fun solve(prefix: String): Int {
        for (i in 0..Int.MAX_VALUE) {
            val answer = (input + i).md5()

            if (answer.startsWith(prefix)) {
                return i
            }
        }

        return 0
    }

    fun part1() {
        val answer = solve("00000")
        println("Day 04, Part 1: $answer")
    }

    fun part2() {
        val answer = solve("000000")
        println("Day 04, Part 1: $answer")
    }

    part1()
    part2()
}

fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16).padStart(32, '0')