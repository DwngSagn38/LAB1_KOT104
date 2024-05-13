package com.example.lab1kot104.BaiTapBuoi3Bai7

open class Nguoi(var hoTen: String,
                 var tuoi: Int,
                 var queQuan: String,
                 var msgv: String) {

    override fun toString(): String {
        return "TT Cá Nhân --> Họ tên : $hoTen, tuổi : $tuoi, quê quán : $queQuan, msgv : $msgv "
    }
}

class CBGV(hoTen: String, tuoi: Int, queQuan: String, msgv: String,
           var luongCung: Float,
           var luongThuong: Float,
           var tienPhat: Float)
    : Nguoi(hoTen, tuoi, queQuan, msgv) {

    companion object {
        val danhSachCBGV = mutableListOf<CBGV>()

        fun themCBGV(cbgv: CBGV) {
            danhSachCBGV.add(cbgv)
            println("Đã thêm cán bộ giáo viên: $cbgv")
        }

        fun xoaCBGV(maGV: String) {
            val CheckCbgv = danhSachCBGV.find { it.msgv == maGV }
            if (CheckCbgv != null){
                danhSachCBGV.remove(CheckCbgv)
                println("Đã xóa thành công giáo viên có mã $maGV")
                println("Sau khi xóa")
                getDanhSachGV()
            }else{
                println("Không tìm thấy giáo viên có mã $maGV")
            }
        }

        fun getDanhSachGV(){
            if (danhSachCBGV.size == 0){
                println("Danh sách rỗng!")
            }else{
                println("Danh sách CBGV")
                for (gv in danhSachCBGV){
                    println(gv)
                }
            }
        }
    }
    fun luongThucLinh(luongCung: Float, luongThuong: Float, tienPhat: Float): Float {
        val tong = luongCung + luongThuong - tienPhat
        return tong
    }

    override fun toString(): String {
        return super.toString() + " --> Có lương cứng = $luongCung đ, lương thửởng = $luongThuong đ , tiền phạt = $tienPhat đ\n" +
                "--> Tổng thực lĩnh = ${luongThucLinh(luongCung,luongThuong,tienPhat)} đ"
    }
}
