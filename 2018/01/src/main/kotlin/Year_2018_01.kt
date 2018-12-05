fun main(args: Array<String>) {

  val lines = ClassLoader::class.java.getResource("/input.txt").readText().lines()

  val changes = lines
    .filter { line -> line.isNotBlank() }
    .map { number -> number.toInt() }

  println("Sum is ${changes.sum()}")

  tailrec fun <T> repeat(acc: List<T>, list: List<T>, times: Int): List<T> = if (times <= 0) acc else repeat(acc + list, list, times - 1)

  fun <T> repeat(list: List<T>, times: Int): List<T> =
    repeat(emptyList(), list, times)

//  val repeatedChanges = repeat(changes, 1)
  val repeatedChanges = repeat(changes, 150)
  val frequencies = repeatedChanges
    .fold(listOf(0)) { list, change ->
      list + (list.last() + change)
    }
//  println("frequencies is $frequencies")

  val counts = frequencies.groupingBy{ it }
    .eachCount()
    .filter { entry -> entry.value > 1 }

  println("counts is $counts")
}
