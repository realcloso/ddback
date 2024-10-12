import strategies.iRace

abstract class Character(
    var name: String = "",
    var strength: Int = 8,
    var dexterity: Int = 8,
    var constitution: Int = 8,
    var intelligence: Int = 8,
    var wisdom: Int = 8,
    var charisma: Int = 8,
    var experiencePoints: Int = 0,
    var level: Int = 1,
    var lifePoints: Int = 10,
    var race: iRace,
    var active: Boolean = true
) {
    init {
        // Aplica o bônus da raça ao criar o personagem
        race.applyRaceBonus(this)
    }
}