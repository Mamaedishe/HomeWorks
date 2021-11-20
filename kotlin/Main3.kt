fun main() {
    print("Введите имя: ")
    val value = readLine()!!.toInt()
    calcChairs(value)
}
fun calcChairs(value: Int){
    val value2 = value/2
    val result = value + value2
    print(result)
}