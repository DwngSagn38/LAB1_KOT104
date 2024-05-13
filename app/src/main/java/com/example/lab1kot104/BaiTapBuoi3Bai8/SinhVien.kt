package com.example.lab1kot104.BaiTapBuoi3Bai8

open class SinhVien(
    var hoTen : String,
    var tuoi : Int,
    var lop : String
    ){

    companion object {
        val listSV = mutableListOf<SinhVien>()

        fun addSV(sv : SinhVien){
            listSV.add(sv);
            println("Thêm thành công sinh viên : ${sv}")
        }

        fun getDanhSach(){
            if (listSV.size == 0){
                println("Danh sách rỗng!")
            }else{
                println("Danh sách sinh viên : ")
                for (sv in listSV){
                    println(sv)
                }
            }
        }

        fun getSinhVien(hoTen: String): SinhVien? {
            val checkSv = listSV.find { it.hoTen == hoTen }
            if (checkSv != null){
                return checkSv
            }else{
                return null
            }
        }
    }

    override fun toString(): String {
        return "SinhVien : hoTen='$hoTen', tuoi=$tuoi, lop='$lop'"
    }

}