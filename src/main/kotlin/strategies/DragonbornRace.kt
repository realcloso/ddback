package strategies

import Character

class DragonbornRace : iRace {
    override fun applyRaceBonus(character: Character) {
        character.strength += 2
        character.dexterity += 0
        character.constitution += 0
        character.intelligence += 0
        character.wisdom += 0
        character.charisma += 1
    }
}