fun main(){
    var nilai = 83
//    if(nilai > 50){
//        println("Anda mendapatkan nilai A")
//    } else{
//        println("Anda mendapat nilai B")
//    }
    if ((nilai >= 80) && (nilai <= 100)){
        println("Nilai anda : A")
    } else if ((nilai < 81) && (nilai >= 60)){
        println("Nilai anda : B")
    } else if ((nilai < 61) && (nilai >= 41)){
        println("Nilai anda : C")
    } else if ((nilai < 41) && (nilai >=21)){
        println("NIlai anda : D")
    } else {
        println("Nilai anda salah")
    }
}