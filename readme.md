## YoRPG Lab 01

**Team Incredibly Cohesive**
*David Chen, Jaylen Zeng, Orion Roven*

## Changelog:

v4:
* Latest version, located in main directory.
* Added subclasses for Protagonist and Monster
* Modified YoRPG driver class to allow player to choose one of the Protagonist subclasses and incorporated random encounters with Monster subclasses.
* Subclasses for Protagonist and Monster have new about() method that returns a description of the class.
* Added Driver Mods to YoRPG.java

v3:
* Fixed bugs in Character.java from v2.
* Instance variables protection changed from public to protected.

v2:
* Created accessor methods for each attribute of a Character.

v1:
* Created Character.java, a superclass for Monster.java and Protagonist.java

v0:
* Made YoRPG compilable.
* Added Monster.java and Protagonist.java

## New Classes:

Character: Superclass of Protagonist and Monster. Initialized instance variables representing attributes of a Character.
Also holds isAlive and attack methods. 

Protagonist: Subclass of Character. Inherits all variables and methods. Adds normalize and specialize which are unique to the protagonist. This is who you play as!

	Swordsman: Subclass of Protagonist. Slightly different attributes (More defense).
	Archer: Subclass of Protagonist. Modifies stats. (Less health and defense but a lot more strength)
	Spearman: Subclass of Protagonist. More health than swordsman but less defense. Also a little stronger.

Monster: Subclass of Character. Represents the enemies you encounter in the RPG. Has unique attributes just like Protagonist.

	Ghoul: Subclass of Monster. One of the enemies you can encounter. Pretty strong.
	Goblin: Subclass of Monster. Pretty weak. Meant to be the common enemy that you can easily defeat.
	Skeleton: Subclass of Monster. One of the stronger enemies you can encounter.

## Future Changes:
* Add unique skills for Protagonists and Monsters
  - Basically when skill is used, a String will be printed describing the skill and it will do different things depending on its purpose.
  - For example, a healing spell so you can recover during battle.
* An option to run from battle when you don't think you can win.
* Boss battles!
* Different armor and weapons so you can powerup your man.


