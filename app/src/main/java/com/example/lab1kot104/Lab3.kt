package com.example.lab1kot104

fun main(){
    // Khai bao va su dung lambda funcition
    var soA : Int?
    var soB : Int?
    println("Nhap so A :")
    soA = readLine()?.toIntOrNull()

    println("Nhap so B :")
    soB = readLine()?.toIntOrNull()

    val tong = tinhTong(soA!!, soB!!)
    println("Tong cua $soA + $soB = $tong")

    val hieu = tinhHieu(soA!!, soB!!)
    println("Hieu cua $soA - $soB = $hieu")

    val binhPhuong = binhPhuong(soA!!)
    println("Binh phuong so $soA la $binhPhuong")

    val thuong = tinhThuong(soA!!.toFloat(), soB!!.toFloat())()
    println("Thuong cua $soA / $soB = $thuong")

    println("\n\nNhap ten bat ky :")
    val ten = readLine().toString()
    println("In Hoa la : ${inHoa(ten)}")


    // Scope functions
    val length = ten.let { // .let thi dung it
        val l = it.length
        l
    }

    println("Do dai chuoi $ten = $length")

    // tham chieu ben trong ham thi dung this
    val a2 = soA.run{ // .run thi dung this
        this * 2
    }
    println(" So A $soA * 2 = $a2")


}

val tinhTong : (Int, Int) -> Int = {soA : Int, soB : Int -> (soA + soB)}

val tinhHieu = {soA : Int, soB : Int -> (soA - soB)}

val binhPhuong : (Int) -> Int = {it * it}

val tinhThuong = {soA : Float, soB : Float -> {
    if(soB == 0f) println("So B phai khac 0")
    soA / soB
}}

val inHoa : (String) -> String = String::uppercase