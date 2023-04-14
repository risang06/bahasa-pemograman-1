fun main(){
    println("Masukkan Bilangan : ")
    val bilangan = readln()

    //String: 1,2,3,4,5,6 -> Array (1,2,3,4,5,6)
    val bil = bilangan.split(",").toTypedArray()
    for (b in bil){
        println(b)
    }
}