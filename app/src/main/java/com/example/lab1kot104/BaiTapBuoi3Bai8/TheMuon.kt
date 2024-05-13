package com.example.lab1kot104.BaiTapBuoi3Bai8

class TheMuon(
    var sinhVien: SinhVien,
    var maPhieu: String,
    var ngayMuon: Int,
    var hanTra: Int,
    var soHieuSach: String
){
    companion object {
        val listTheMuon = mutableListOf<TheMuon>()

        fun addTheMuon(theMuon: TheMuon){
            listTheMuon.add(theMuon)
            println("Thêm thành công : $theMuon")
            getDanhSachThe()
        }

        fun deleteTheMuon(maPhieu: String){
            var phieuCheck = listTheMuon.find { it.maPhieu == maPhieu }
            if (phieuCheck != null){
                listTheMuon.remove(phieuCheck)
                println("Đã xóa thành công phiếu $maPhieu")
            }else{
                println("Không tìm thấy phiếu nào có mã $maPhieu")
            }
        }

        fun getDanhSachThe(){
            if (listTheMuon.size == 0){
                println("Danh sách rỗng!")
            }else{
                println("Danh sách thẻ mượn : ")
                for (the in listTheMuon){
                    println(the)
                }
            }
        }
    }

    override fun toString(): String {
        return "TheMuon : maPhieu='$maPhieu', ngayMuon=$ngayMuon, hanTra=$hanTra, soHieuSach='$soHieuSach' -->" +
                "Sinh viên mượn : $sinhVien"
    }
}