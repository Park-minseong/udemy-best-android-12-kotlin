package kr.ilf.helloworld

fun main() {
    var denis = Person("Denis", "Panjuta")
    var john = Person(lastName = "Peterson")

    val mobilePhone1 = MobilePhone("Android", "Samsung", "Galaxy S22 Ultra")
    val mobilePhone2 = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    val mobilePhone3 = MobilePhone("IOS", "Apple", "IPhone 14 pro")
}

// 53. 클래스와 초기화
class Person(firstName: String = "John", lastName: String) {

    //initializer Block
    init {
        println(
            "Initialized a new Person object with " +
                    "firstName = $firstName and lastName = $lastName"
        )
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