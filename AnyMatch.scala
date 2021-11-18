object AnyMatch extends App {

    def anyTypeCheck(x: Any) = {
        x match {
            case 2         => x.toString + " is Int"
            case 5.3       => x.toString + " is Double"
            case "Dog"     => x.toString + " is String"
            case true      => x.toString + " is Boolean"
            case 3 | "Cat" => x.toString + " is Int or String"
            case _         => x.toString + " is Another type"
        }
    }

    val two = anyTypeCheck(2)
    println(two) // 2 is Int

    val fivePointThree = anyTypeCheck(5.3)
    println(fivePointThree) // 5.3 is Double

    val dog = anyTypeCheck("Dog")
    println(dog) // Dog is String

    val trueValue = anyTypeCheck(true)
    println(trueValue) // true is Boolean

    val cat = anyTypeCheck("Cat")
    println(cat) // Cat is Int or String

    val list = anyTypeCheck(List(1, 2, 3))
    println(list) // List(1, 2, 3) is Another type
}


// =====================================
//         Output Sample
// =====================================
// $ scalac AnyMatch.scala 
// $ scala AnyMatch
// 2 is Int
// 5.3 is Double
// Dog is String
// true is Boolean
// Cat is Int or String
// List(1, 2, 3) is Another type