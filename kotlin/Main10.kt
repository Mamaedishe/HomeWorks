fun main() {
    val bugOne = Bug(20,"Alan")
    val bugTwo = BugCivilian(30,"Tobi")
    bugTwo.getSugarLimit()
    bugOne.getSugarLimit()

    println(bugOne.getId())
    println(bugTwo.getId2())

}
open class Bug(val rank: Int, val name:String) {
    open fun getSugarLimit(): Int{
        return rank
    }

    fun getId(): String{
        return "${rank}.${name}"
    }
}
class BugCivilian(val rank2: Int, val name2:String) : Bug(rank2, name2){
    override fun getSugarLimit(): Int {
        return rank2/2
    }
    fun getId2(): String{
        return "${rank2}.${name2}"
    }

}

