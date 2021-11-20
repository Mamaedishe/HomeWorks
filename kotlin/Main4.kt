fun main() {
    print("Введите день недели: ")
    val dayNumber = readLine()!!.toInt()
    print("Введите ранг пришельца: ")
    val bugRank = readLine()!!.toInt()
    print("Введите количество килограммов сахара хотите купить: ")
    val sugarAlien = readLine()!!.toInt()
    cashAmount(dayNumber, bugRank, sugarAlien)
}
fun cashAmount(dayNumber: Int,bugRank: Int, sugarAlien: Int){
    val result = (dayNumber*(bugRank+42))*sugarAlien
    print("Итоговая цена сахара: $result кредитов")
}