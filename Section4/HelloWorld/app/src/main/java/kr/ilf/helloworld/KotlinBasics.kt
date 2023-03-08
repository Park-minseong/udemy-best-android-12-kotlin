package kr.ilf.helloworld

fun main() {
    var denis = Person("Denis", "Panjuta")
    var john = Person(lastName = "Peterson")

}

class Person(firstName: String = "John", lastName: String) {

    //initializer Block
    init {
        println(
            "Initialized a new Person object with " +
                    "firstName = $firstName and lastName = $lastName"
        )
    }
}

