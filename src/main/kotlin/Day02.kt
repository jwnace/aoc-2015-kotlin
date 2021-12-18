import java.io.File

fun main() {
    val input = File("input/day02.txt").readLines()

    fun part1() {
        var total = 0

        for (line in input) {
            val values = line.split('x').map { it.toInt() }
            val (l, w, h) = values

            val a = l * w
            val b = w * h
            val c = h * l

            val surfaceArea = 2 * a + 2 * b + 2 * c
            val smallestSide = minOf(a, b, c)

            total += surfaceArea + smallestSide
        }

        println("Day 02, Part 1: $total")
    }

    fun part2() {
        var total = 0

        for (line in input) {
            val values = line.split('x').map { it.toInt() }.sorted()
            val (a, b, c) = values

            val perimeter = 2 * a + 2 * b
            val bow = a * b * c

            total += perimeter + bow
        }

        println("Day 02, Part 2: $total")
    }

    part1()
    part2()
}
