package strategies

import Character

class HumanRace : iRace {
    override fun applyRaceBonus(character: Character) {
        character.strength += 1
        character.dexterity += 1
        character.constitution += 1
        character.intelligence += 1
        character.wisdom += 1
        character.charisma += 1
    }
}