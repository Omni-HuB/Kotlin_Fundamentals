package com.example.basics

/**************
If statement as an expression
In Kotlin you can use if statement as an expression, for example, you can assign the result of if-else to a variable. Let's look at an example
***************/

fun main() {
//create a variable for testing all condition
    val age = 16
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge = if (age >= drinkingAge) {
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    } else if (age >= votingAge) {
        println("You may vote now")
//return the value for this block
        votingAge
    } else if (age >= drivingAge) {
        println("You may drive now")
//return the value for this block
        drivingAge
    } else {
        println("You are too young")
//return the value for this block
        age
    }
//print the age for the passing condition
    print("current age is $currentAge")


/***************

Now when we run with the value of age as 16, it prints

You may drive now current age is 16

When we run with a value of age as 22, it prints

Now you may drink in the US current age is 21

So it actually prints the passing block with the equivalent age.

 **************/


    //   println(whenStatements())
}





//  Here you can find the code of the lectures "If Statements" and
//  "When Expressions" with some more details:



 fun whenStatements() {
     // Control Flows
     // If Statements
     var age = 17
     if (age >= 21) {
         print("now you may drink in the US")
     }
     // Else If Statement - only executed if the if statement is not true
     else if (age >= 18) {
         print("now you may vote")
     }
     // Else If Statement - only executed if the foregoing else if statement is not true
     else if (age >= 16) {
         print("you now may drive")
     }
     // else is only executed if all of the foregoing statements weren't true
     else {
         print("you're too young")
     }

     // Kotlin’s "when" expression is the replacement of the switch statement
     // from other languages like C, C++, and Java.
     // It is compact and more powerful than switch statements.
     var season = 3
     when (season) {
         1 -> println("Spring")
         2 -> println("Summer")
         3 -> println("Fall")
         4 -> println("Winter")
         else -> println("Invalid Season")
     }
     var month = 3
     when (month) {
         1, 2, 3 -> println("Spring")
         in 4..6 -> println("Summer")
         in 7..9 -> println("Fall")
         in 10..12 -> println("Winter")
         else -> println("Invalid Season")
     }

     // challenge - translate the if statement with the age to a when expression
     when (age) {
         // with the !in it's the same as saying not in ...
         !in 0..20 -> print("now you may drink in the US")
         in 18..20 -> print("now you may vote")
         16, 17 -> print("you now may drive")
         else -> print("you're too young")
     }

     var x: Any = 13.37
     when (x) {
         is Int -> println("$x is an Int")
         !is Double -> println("$x is not Double")
         is String -> println("$x is a String")
         else -> println("$x is none of the above")
     }


 }

/*************
When as an expression
Just like if-else, when can also be used as an expression by assigning it to a variable. Here is an example:


var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }


val x : Any = 13.37
//assign when to a variable
  val result =  when(x) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
//then print x with the result
print("$x $result")
Now we have simplified the first when statement to a shorter and cleaner code using expression

***************/



