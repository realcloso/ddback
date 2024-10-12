package strategies

import Character

class ElfRace : iRace {
    override fun applyRaceBonus(character: Character) {
        character.strength += 0
        character.dexterity += 2
        character.constitution += 2
        character.intelligence += 2
        character.wisdom += 1
        character.charisma += 2
    }
}