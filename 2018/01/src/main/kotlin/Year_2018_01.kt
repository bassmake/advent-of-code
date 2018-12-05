fun main(args: Array<String>) {

  val lines = ClassLoader::class.java.getResource("/input.txt").readText().lines()

  val summed = lines
    .filter { line -> line.isNotBlank() }
    .map { number -> number.toInt() }
    .sum()

  println("Sum is $summed")
}
