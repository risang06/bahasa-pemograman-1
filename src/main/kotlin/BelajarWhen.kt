fun main(){
//    val nilai = 70
//
//    when (nilai){
//        100 -> print("Sempurna")
//        90,91,92,93,94,95,96,97,98,99 -> print("Sangat Baik")
//        in 80..89 -> print("Baik")
//        !in 0..100 -> print("Nilai tidak valid")
//        else -> print("Cukup")
//    }

    val number = intArrayOf(30,26,70,40,32,20,11,80)

    for (number in number)
        if (number % 2 == 0){
            println("$number Bilangan Genap")
    } else {
        println ("$number Bilangan Ganjil")
        }
}