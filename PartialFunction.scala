object partialFunction{
  val  fraction = new PartialFunction[Int,Int]{
    def apply(d: Int) = d*d*d
    def isDefinedAt(d:Int) = d != 0
  }
  def main(args:Array[String]):Unit={
    print("Enter first number:")
    val input1 = scala.io.StdIn.readInt()
    print("Enter the second number:")
    val input2 = scala.io.StdIn.readInt()
    print("third value is 36")
    val addConstantTo: PartialFunction[(Int, Int), Int] = {
      case (a, b) => a + b + 36
    }
    var sum: Int = addConstantTo(input1,input2)
    print("total of 3 numbers: " +sum)
    var result: Int = input1+input2
    print("the square of inputs: "+fraction.apply(result))
  }
}
