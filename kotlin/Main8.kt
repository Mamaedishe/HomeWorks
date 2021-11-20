fun main()  {
    var nibirunianClass = NibirunianClass()
    println("Введите имя ")
    var name = readLine()!!.toString()
    nibirunianClass.createNamePlate(name)

}
class NibirunianClass {
    public var namePlate : String = ""
    fun createNamePlate (name : String){
        val message = "Живи долго и счастливо, $name"

        val result = namePlate+message
        println(result)
    }

}