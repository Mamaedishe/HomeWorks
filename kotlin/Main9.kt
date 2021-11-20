fun main(){

    var sugar = SugarStorage()
    sugar.decreaseSugar(10)
    sugar.increaseSugar(20)
    println(sugar.volume)
}
class SugarStorage(var volume:Int = 200){
    fun decreaseSugar(v:Int) {
        if (v > 0) {
            volume -= v
        }
        if (volume < 0) {
            volume = 0
        }
    }
    fun increaseSugar(v:Int) {
        if (v > 0) {
            volume += v
        }
    }
}