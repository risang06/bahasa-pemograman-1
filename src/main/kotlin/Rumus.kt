fun main(){

    println("Rumus Luas dan Keliling Persegi Panjang ")
    println("Masukkan panjang :")
    var panjang = readln().toInt()


    println("Masukkan Lebar :")
    var lebar = readln().toInt()


    var luas = panjang * lebar
    var keliling = 2*(panjang + lebar)


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

}
