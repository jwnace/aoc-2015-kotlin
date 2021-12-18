import java.io.File

fun main() {
    val input = File("input/day01.txt").readText()

    fun part1() {
        val answer = input.count { it == '(' } - input.count { it == ')' }

        println("Day 01, Part 1: $answer")
    }

    fun part2() {
        var floor = 0

        for (i in input.indices) {
            floor += if (input[i] == '(') 1 else -1

            if (floor == -1) {
                println("Day 01, Part 2: ${i + 1}")
                return
            }
        }
    }

    part1()
    part2()
}
