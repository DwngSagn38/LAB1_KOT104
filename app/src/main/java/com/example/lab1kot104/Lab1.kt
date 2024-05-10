package com.example.lab1kot104

fun main() {
    questions()
}

fun bai2(){
    println("Bài 2 ")
    print("Nguyễn Văn Anh - PS123456\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")
    questions()
}

// bài 3
fun bai3() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
    questions()
}

fun questions(){
    println("\n\n\t\t\tWelcome to KOTLIN PH42693")
    println("1. Do while \t 2. Bài 2 \t 3. Bài 3 \t 4. While \n" +
            "5. For \t 6. Classes \t 7. Equality Check \t 8. Tìm max \n" +
            "any. Good bye")
    var s = readLine()
    chooseQuestion(s.toString())
}

// VD1 : When
fun chooseQuestion(obj: Any) : Any{
    val result  = when(obj){
        "1" -> questionMath()
        "2" -> bai2()
        "3" -> bai3()
        "4" -> questionLiterature()
        "5" -> testFor()
        "6" -> classes()
        "7" -> equalityCheck()
        "8" -> TimMax()
        else -> println("See you again!")
    }
    return result
}

// VD2 : Vòng lặp do while
fun questionMath(){
    println("Câu hỏi về toán học : " +
            "2 con vịt đi trước 2 con vịt, " +
            "2 con vịt đi sau 2 con vịt, " +
            "2 con vịt đi giữa 2 con vịt. " +
            "Hỏi có bao nhiêu con vịt?")

    println("A. 6 \t B. 4 \t C. 2 \t D. 8")
    var answer : String
    do {
        println("Vui lòng chọn A B C hoặc D")
        println("Đáp án của bạn là : ")
        var s = readLine()
        answer = s.toString()
    }while (!isAnswerValid(answer))
    answerMath(answer.lowercase())
    questions()
}

fun answerMath(obj : Any): Any {
    val result = when (obj) {
        "b" -> println("Hoàn toàn chính xác!");
        else -> println("Về học thêm đi!");
    }

    return result
}

// VD3 : Vòng lặp while
fun questionLiterature() {
    println("Câu hỏi về văn học ( Điền vào chỗ trống ) : " +
            "Anh đi anh nhớ quê nhà, nhớ ... nhớ cà dầm xương.")
    println("A. Cơm mẹ nấu \t B. Bà hàng xóm \t C. Cô em gái \t D. Canh rau muống")
    var answer = ""
    println("Đáp án của bạn là : ")
    var s = readLine().toString();
    while (!isAnswerValid(s)){
        println("Vui lòng chọn đáp án A B C hoặc D")
        println("Đáp án của bạn là : ")
        s = readLine().toString();
    }
    answer = s
    answerLiterature(answer)
    questions()
}
fun answerLiterature(obj: Any) : Any {
    val result = when(obj){
        "d" -> println("Bạn quá xuất sắc!")
        else -> println("Còn non và xanh lắm")
    }
    return result
}

fun isAnswerValid(s : String): Boolean{
    val lowerCase = s.lowercase()
    return lowerCase == "a" || lowerCase == "b" || lowerCase == "c" || lowerCase == "d"
}

// VD4 : Vòng lặp for
fun testFor() {
    var n : Int = 0
    do {
        println("Nhập 1 số bất kỳ")
        var s = readLine()
        if (isIntValid(s.toString())){
            n = s.toString().toInt()
        }
    }while (!isIntValid(s.toString()))


    println("Các số từ 0 đến $n")
    // 0..5 là 0 1 2 3 4 5
    for (i in 0..n) {
        print("$i ")
    }

    println("\nCác số từ 0 đến bé hơn $n")
    // từ 0 < n until là bé hơn
    for (i in 0 until n) {
        print("$i ")
    }

    println("\nCác số từ 2 đến $n chia hết cho 2")
    // 2 > n step : bước nhảy 2
    for (i in 2..n step 2) {
        print("$i ")
    }

    println("\nCác số từ $n về 0")
    // n về 0 downTo là ngược lại
    for (i in n downTo 0) {
        print("$i ")
    }
    println(" ")
    questions()
}

// VD 5 : vd về class
class Student(var name: String, var age : Int)

fun classes() {
    println("Nhập họ tên")
    var s = readLine()
    var name : String = ""
    if (s != null) name = s.toString();
    println("Nhập tuổi")
    var age : Int = 0
    var t = readLine()
    while (!isIntValid(t.toString())) {
        println("Nhập tuổi")
        t = readLine()
    }
    age = t.toString().toInt()
    val student = Student(name,age);
    println("Tên của bạn là ${student.name} độ tuổi ${student.age}")
    questions()
}

// VD6 : Kiểm tra số nguyên
fun isIntValid(s : String) : Boolean {
    val intString = s.toString()
    val isInt = intString.toIntOrNull()
    if (isInt != null) {
        return true
    } else {
        return false
    }
}

// VD7 : ví dụ về == và ===
fun equalityCheck(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers)
    questions()
}

// VD8 : tìm max trong 2 số
fun TimMax(){
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    var a : Int = 0
    var b : Int = 0

    println("Nhập số a")
    var s = readLine()
    if (isIntValid(s.toString())){
        a = s.toString().toInt()
    }

    println("Nhập số b")
    var t = readLine()
    if (isIntValid(t.toString())){
        b = t.toString().toInt()
    }
    println("Số lớn hơn là ${max(a,b)}")
    questions()
}
