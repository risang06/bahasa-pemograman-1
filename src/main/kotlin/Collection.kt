fun main() {
    val hari = listOf("Senin","Selasa","Rabu","Kamis",null,null,"Senin")
    println(hari)
    println(hari[0])
    println(hari.get(2))

    val hariMutable = mutableListOf("Senin","Selasa","Rabu","Kamis",null,null,"Senin")
    println(hariMutable)
    hariMutable[4] = "Jum'at"
    hariMutable.set(5, "Sabtu")
    println(hariMutable)

    hariMutable.removeAt(6)
    println(hariMutable)
    hariMutable.add("Minggu")
    println(" Hari MutablelistOf : $hariMutable")

    hariMutable.forEach{
        print("$it,")
    }
    println()
    for (day in hariMutable)
        print("$day,")
}