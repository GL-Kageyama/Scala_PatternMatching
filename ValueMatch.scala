object ValueMatch extends App {

    def intValueCheck(x: Int) = {
        x match {
            case 1              => "Value is 1"
            case 2              => "Value is 2"
            case 3 | 4          => "Value is 3 or 4"
            case 5 | 6          => "Value is 5 or 6"
            case 7 | 8 | 9 | 10 => "Value is 7 to 10"
            case _              => "Value is other than 1 to 10"
        }
    }

    val intA = intValueCheck(2)
    println(intA) // Value is 2

    val intB = intValueCheck(4)
    println(intB) // Value is 3 or 4

    val intC = intValueCheck(9)
    println(intC) // Value is 7 to 10

    val intD = intValueCheck(22)
    println(intD) // Value is other than 1 to 10
}


// =====================================
//         Output Sample
// =====================================
// $ scalac ValueMatch.scala 
// $ scala ValueMatch
// Value is 2
// Value is 3 or 4
// Value is 7 to 10
// Value is other than 1 to 10