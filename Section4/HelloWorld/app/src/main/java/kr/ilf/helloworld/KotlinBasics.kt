package kr.ilf.helloworld

fun main() {
    var denis = Person("Denis", "Panjuta", 31)
    denis.hobby = "to skateboard"
    denis.age = 32
    println("Denis is ${denis.age} years old")
    denis.stateHobby()

    var john = Person(lastName = "Peterson")
    john.hobby = "play video games"
    john.stateHobby()
//    val mobilePhone1 = MobilePhone("Android", "Samsung", "Galaxy S22 Ultra")
//    val mobilePhone2 = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
//    val mobilePhone3 = MobilePhone("IOS", "Apple", "IPhone 14 pro")
}

// 53. 클래스와 초기화, 57. 멤버변수 - 함수과 생성자
class Person(firstName: String = "John", lastName: String) {
    // Member Variables = Properties
    var firstName : String? = null
    var age : Int? = null
    var hobby : String = "watch Netflix"

    //initializer Block
    init {
        this.firstName = firstName
        println(
            "Initialized a new Person object with " +
                    "firstName = $firstName and lastName = $lastName"
        )
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName and age $age")
    }


    // Member Function = Method
    fun stateHobby(){
        println("$firstName hobby is $hobby")
    }
}

// 54. 클래스와 오브젝트 연습문제
class MobilePhone(var osName: String, var brand: String, var model: String) {
    init {
        println("osBrand: $osName, brand: $brand, model: $model")
    }
}

// 56. 변수 영역과 쉐도잉
fun myFunction(a: Int) {
    var a = 3  //shadowing
}