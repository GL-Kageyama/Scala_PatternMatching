# Scala : Pattern Matching

## match Expression
The match expression checks which case clause the value of the expression to be compared matches.　　

## Code Sample
```Scala
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
```
