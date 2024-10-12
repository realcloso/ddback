package strategies

import Character

class DwarfRace : iRace {
    override fun applyRaceBonus(character: Character) {
        character.strength += 2
        character.dexterity += 0
        character.constitution += 2
        character.intelligence += 0
        character.wisdom += 1
        character.charisma += 0
    }
}