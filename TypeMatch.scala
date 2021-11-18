object TypeMatch extends App {

    def valueTypeCheck(x: Any) = {
        x match {
            case a: String    => a + " is String"
            case a: Int       => a.toString + " is Int"
            case a: Double    => a.toString + " is Double"
            case a: Boolean   => a.toString + " is Boolean"
            case a: List[Any] => a.toString + " is list"
            case _            => "Another type"
        }
    }

    val dog = valueTypeCheck("Dog")
    println(dog) // Dog is String

    val five = valueTypeCheck(5)
    println(five) // 5 is Int

    val onePointFive = valueTypeCheck(1.5)
    println(onePointFive) // 1.5 is Double

    val trueValue = valueTypeCheck(true)
    println(trueValue) // true is Boolean

    val list = valueTypeCheck(List(1, 2, 3))
    println(list) // List(1, 2, 3) is list

    val symbol = valueTypeCheck(Symbol("Cat"))
    println(symbol) // Another type
}


// =====================================
//         Output Sample
// =====================================
// $ scalac TypeMatch.scala 
// $ scala TypeMatch
// Dog is String
// 5 is Int
// 1.5 is Double
// true is Boolean
// List(1, 2, 3) is list
// Another type