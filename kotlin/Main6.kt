fun calculateEvenDigits(input: String): Int {
    var sum = 0
    for(c in input) {
        val digit = c - '0'
        if (digit % 2 == 0) {
            sum += digit
        }
    }
    println("Сумма четных цифр: ")
    return sum
}
fun main(args: Array<String>) {
    println("Введите строку из чисел: ")
    val a : String? = readLine()
    if(a!=null){
        print(calculateEvenDigits(a.toString()))
    }
}