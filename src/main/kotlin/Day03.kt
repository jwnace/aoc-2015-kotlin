import java.io.File

fun main() {
    val input = File("input/day03.txt").readText()

    fun part1() {
        val houses = mutableListOf(0 to 0)

        var x = 0
        var y = 0

        for (i in input.indices) {
            when (input[i]) {
                '^' -> y++
                'v' -> y--
                '<' -> x--
                '>' -> x++
            }

            houses.add(x to y)
        }

        val answer = houses.groupBy { it }.count()

        println("Day 03, Part 1: $answer")
    }

    fun part2() {
        var santaX = 0
        var santaY = 0

        var robotX = 0
        var robotY = 0

        val houses = mutableListOf(0 to 0, 0 to 0)

        for (i in 0 until input.length step 2) {
            when (input[i]) {
                '^' -> santaY++
                'v' -> santaY--
                '<' -> santaX--
                '>' -> santaX++
            }

            houses.add(santaX to santaY)
        }

        for (i in 1 until input.length step 2) {
            when (input[i]) {
                '^' -> robotY++
                'v' -> robotY--
                '<' -> robotX--
                '>' -> robotX++
            }

            houses.add(robotX to robotY)
        }

        val answer = houses.groupBy { it }.count()

        println("Day 03, Part 2: $answer")
    }

    part1()
    part2()
}
