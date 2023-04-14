import java.lang.NumberFormatException

fun keliling(panjang: Int, lebar: Int): Int {
    return 2*(panjang*lebar)
}

infix fun Int.kali(nilai:Int): Int {
    return this * nilai
}


fun main() {
    do {

        try{
        println("Rumus Luas dan Keliling Persegi Panjang ")
        println("Masukkan panjang :")
        var panjang = readln().toInt()


        println("Masukkan Lebar :")
        var lebar = readln().toInt()


        var luas = panjang kali lebar
        var keliling = keliling(panjang, lebar)


        var array = mutableListOf<String>()
        array.add("$panjang")
        array.add("$lebar")
        array.add("$luas")
        array.add("$keliling")




        println("=================================================")
        println("Luas : $luas")
        println("Keliling : $keliling")
        println("Collection : $array")
        println("=================================================")
    } catch (e: NumberFormatException) {
            println("Nilai Tidak Valid")
        }
    } while (true)
}




