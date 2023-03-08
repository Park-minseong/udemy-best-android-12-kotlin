package kr.ilf.helloworld

fun main() {
    // immutable variable
    // TODO: Add new functionality

    /*
    This
    is a multiline
    comment
    */

    // type string
    val myName = "Frank"
    // type int 32bit
    // type inference finds out the type from context
    var myAge = 28

    // Integer TYPES: Byte(8 bit), Short(16 bit)
    // Int(32 bit), Long(64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265458979323846

    // Boolean he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("Last Character: " + lastCharInStr)

    // 23. 연습문제
    var string: String = "Android Masterclass"
    val float: Float = 13.37F
    val pi: Double = 3.14159265358979
    var byte: Byte = 25
    var short: Short = 2020
    var long: Long = 18881234567
    var boolean: Boolean = true
    var char: Char = 'a'

    // 25. 문자열 보간법-문자열 견본
    val myStr2 = "Hello World"
    var firstCharInStr2 = myStr2[0]
    var lastCharInStr2 = myStr2[myStr2.length - 1]
    var myLnegth = myStr2.length

    // 스트링 템플릿 표현식, 스트링 인터폴레이션
    print("First Character: $firstCharInStr2 and the length of myStr is ${myStr2.length}")

    // 30~33. if, when
    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Automn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("winter")
        else -> println("incalid Season")
    }

    var age = 0
    when (age) {
        // in 21..150 -> println("now you may drink in the US")
        !in 0..20 -> println("now you may drink in the US")
        in 18..20 -> println("You may vote now")
        16, 17 -> println("you may drive now")
        else -> println("you're too young")
    }

    var x: Any = 13.37f
    when (x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of above")
    }

    for (num in 1..10) {
        println("$num")
    }

    for (i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }

    for (i in 10 downTo 1 step 2) { // Same as - for(i in 10.downTo(1).step(2))
        print("$i")
    }
}