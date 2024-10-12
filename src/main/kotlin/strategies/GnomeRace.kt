package strategies

import Character

class GnomeRace : iRace {
    override fun applyRaceBonus(character: Character) {
        character.strength += 0
        character.dexterity += 1
        character.constitution += 1
        character.intelligence += 2
        character.wisdom += 0
        character.charisma += 0
    }
}