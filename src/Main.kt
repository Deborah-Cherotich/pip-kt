fun main() {
    val drs = DisasterRecoverySystem()
    drs.addSituation("Kitale", "Fire")
    drs.addSituation("Nairobi", "Earthquake")
    println(drs.getSituation("Kitale"))
    println(drs.getSituation("Nairobi"))
}

class DisasterRecoverySystem {
    private val situations = mutableMapOf<String, MutableList<String>>()
    fun addSituation(place: String, situation: String) {
        if (!situations.containsKey(place)) {
            situations[place] = mutableListOf()
        }
        situations[place]?.add(situation)
    }
    fun getSituation(location: String): List<String>? {
        return situations[location]
    }
}

