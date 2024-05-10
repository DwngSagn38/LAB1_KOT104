package com.example.lab1kot104

fun main(){

    do {
        println("\t\t LAB2 KOT103 PH42693")
        println("1. Bài 1")
        println("2. Bài 2")
        println("3. Bài 3")
        println("4. Ví dụ Class")
        println("Mời nhập : ")
        var s = readLine()
        menu(s!!)

        println("Nhập bất kỳ để tiếp tục , nhập e để thoát : ")
        var c = readLine()
        if (c == "e"){
            break
        }
    }while (true)


}

fun menu(obj : Any): Any{
    val result = when(obj){
        "1" -> bai1Lab2()
        "2" -> bai2Lab2()
        "3" -> bai3Lab2()
        "4" -> viduClass()
        else -> "Goodbye!"
    }
    return result
}

fun viduClass(){
    var s : String?
    do {
        // Khai báo và sử dụng kĩ thuật safety

        var mssv : String? = null
        // var tenSV : String = null // Biến muốn gán giá trị null thì phải có dấu hỏi chấm
        println("Nhập mssv muốn tìm : ")
        s = readLine()
        mssv = s.toString()

        val tenSV = getTensv(mssv!!) // thêm 2 dấu !! để loại bỏ null
        println("Tên Sinh Viên $tenSV có mssv là $mssv")
        print("Tiếp không?(c/k):")

        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}

val danhSachSV : Map<String, String> = mutableMapOf("PH42693" to "Lê Đăng Sang", "PH42640" to "Phạm Minh Hiếu")
fun getTensv(mssv : String) : String? {
    val tenSV = danhSachSV.get(mssv)
    if (tenSV == null) println("Không tìm thấy tên sinh viên")
    return tenSV
}

fun bai1Lab2(){
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
}

fun bai2Lab2(){
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}

fun bai3Lab2(){
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}