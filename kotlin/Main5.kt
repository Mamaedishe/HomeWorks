fun main() {
    println("Введите год: ")
    val year = readLine()!!.toInt()
    getYearEra(year)
}

fun getYearEra(year: Int) {
//val year:Int = Integer.valueOf(readLine())
    if (year<1970)
        println("До Unix-эры")
    else if (year==1970)
        println("Соответствует Unix-эре")
    else if (year<2000)
        println("После Unix-эры, но до XXI")
    else if (year>=2000)
        println("После XX века")
    else if (year>=3000)
        println("Это далекое будущее")
    else
        println("Введите корректную дату")
}