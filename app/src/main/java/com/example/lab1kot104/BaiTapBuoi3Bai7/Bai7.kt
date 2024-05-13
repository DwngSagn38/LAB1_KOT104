package com.example.lab1kot104.BaiTapBuoi3Bai7


fun main(){
    do {
        println("Bài 7 buổi 3 PH42693")
        println("1. Hiển thị danh sách cán bộ giáo viên")
        println("2. Thêm giáo viên mới")
        println("3. Xóa giáo viên theo mã")
        println("Bấm bất kỳ để thoát")
        println("Mời bạn chọn : ")
        var choose = readLine()?.toIntOrNull() ?: -1
        when(choose){
            1 -> CBGV.getDanhSachGV()
            2 -> addCBGV()
            3 -> deleteCBGV()
            else -> break
        }

        println("Bạn có muốn tiếp tục hay không ( Bấm c để tiếp tục) ?")
        var s = readLine()
        if (s != "c") break
    }while (true)
}

fun addCBGV(){
    println("Nhập tên CBGV: ")
    var hoTen = readLine().toString()
    var tuoi = 0
    do {
        println("Nhập tuổi : ")
        tuoi = readLine()?.toIntOrNull() ?: -1
        if (tuoi > 0) break
    }while (true)

    println("Nhập quê quán : ")
    val queQuan = readLine().toString()

    println("Nhập msgv : ")
    val msgv = readLine().toString()

    println("Nhập Lương cứng : ")
    val luongCung = readLine()?.toFloatOrNull() ?: 0f

    println("Nhập Lương Thưởng : ")
    val luongThuong = readLine()?.toFloatOrNull() ?: 0f

    println("Nhập tiền phạt : ")
    val tienPhat = readLine()?.toFloatOrNull() ?: 0f

    val gv = CBGV(hoTen,tuoi,queQuan,msgv,luongCung,luongThuong,tienPhat)
    CBGV.themCBGV(gv)
}

fun deleteCBGV(){
    println("Nhập mã số giáo viên muốn xóa : ")
    val maGv = readLine().toString()
    CBGV.xoaCBGV(maGv)
}