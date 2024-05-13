package com.example.lab1kot104.BaiTapBuoi3Bai8

fun main(){
    do {
        println("Bài 8 buổi 3 PH42693")
        println("1. Hiển thị danh sách sinh vien")
        println("2. Hiển thị danh sách thẻ mượn")
        println("3. Thêm sinh viên mới")
        println("4. Thêm thẻ mượn ")
        println("5. Xóa thẻ mượn ")
        println("Bấm bất kỳ để thoát")
        println("Mời bạn chọn : ")
        val choose = readLine()?.toIntOrNull() ?: -1
        when(choose){
            1 -> SinhVien.getDanhSach()
            2 -> TheMuon.getDanhSachThe()
            3 -> addSinhVien()
            4 -> addTheMuon()
            5 -> deleteTheMuon()
            else -> break
        }

        println("Bạn có muốn tiếp tục hay không ( Bấm c để tiếp tục) ?")
        val s = readLine()
        if (s != "c") break
    }while (true)
}

fun addSinhVien(){
    println("Nhập họ tên sinh viên : ")
    val hoTen = readLine().toString()

    var tuoi : Int
    do {
        println("Nhập tuổi ( lớn hơn 0 ): ")
        tuoi = readLine()?.toIntOrNull() ?: -1
    }while (tuoi <= 0)

    println("Nhập lớp : ")
    val lop = readLine().toString()

    val sv = SinhVien(hoTen,tuoi,lop)
    SinhVien.addSV(sv)
}

fun addTheMuon(){
    var ngayMuon : Int
    var hanTra : Int
    var sv : SinhVien
    do {
        println("Nhập tên sinh viên mượn sách : ")
        val tenSv = readLine().toString()
        sv = SinhVien.getSinhVien(tenSv)!!
        if (sv != null) break
    }while (true)



    println("Nhập mã phiếu : ")
    val maPhieu = readLine().toString()

    do {
        println("Nhập ngày mượn (số nguyên dương) : ")
        ngayMuon = readLine()?.toIntOrNull() ?: -1
        if (ngayMuon > 0) break
    }while (true)

    do {
        println("Nhập hạn trả (số nguyên dương) : ")
        hanTra = readLine()?.toIntOrNull() ?: -1
        if (hanTra > 0) break
    }while (true)

    println("Nhập số hiệu sách : ")
    val soHieuSach = readLine().toString()

    val theMuon = TheMuon(sv,maPhieu,ngayMuon,hanTra,soHieuSach)
    TheMuon.addTheMuon(theMuon)
}

fun deleteTheMuon(){
    println("Nhập mã thẻ muốn xóa : ")
    var maThe = readLine().toString()
    TheMuon.deleteTheMuon(maThe)
}