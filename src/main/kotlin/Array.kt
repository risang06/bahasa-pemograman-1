fun main() {
    var dosen =  arrayOf("Hendra", "Afrig", "Bety", "Rikmah", "Farid", "Hikmah", null)
    for (nama in dosen){
        print("$nama, ")
    }
    println()
    println(dosen[1])
    println(dosen.get(0))
    dosen[0] = "Hendra Kurniawan"
    dosen.set(4, "Farid Fauzi")

    for (nama in dosen){
        print("$nama, ")
    }
    dosen = arrayOf("Hello Friends")
    println()

    for (nama in dosen){
        print("$nama, ")
    }
}