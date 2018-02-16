
import scala.annotation.switch
object switch {
  def main(args: Array[String]):Unit = {
    println("Acadgild course list")
    println("1) Android")
    println("2) Big data")
    println("3) Spark")
    print("Enter any other course")
    val input = scala.io.StdIn.readInt()
    val x = (input: @switch) match {
      case 1 => println("Android costs Rs.12999")
      case 2 => println("Big Data Development costs Rs.17999")
      case 3 => println("Spark costs Rs.19999 ")
      case _ => println("Enter a valid number")

    }
    }
  }

