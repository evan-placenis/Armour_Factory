# Armour_Factory
This is a game that revolves around randomly dropping loot from an enemy. This loot has a rarity, armor type, and boosts the player's attributes depending on the rarity. The purpose of this is to practice the factory and decorator design pattern. 

Factory:<br />
The factory pattern makes code more robust, less coupled, and easy to extend. I decided this
was the correct choice to spawn armor. The factory method allows me to add new armor without
opening and changing the existing code making it a robust choice. It also reduces the amount of
reused code in the application by using the factory spawner. In addition to adding new armor it
also makes removing existing armor in the application very easy with low possibility of breaking
existing code. Another reason why I implemented the factory design pattern is because I
don’t want duplicate armor types, this implementation forces the user to spawn a single armor type
when they want to use it. This is also the main reason why I chose to spawn the rarity in a
factory pattern as well. Although I originally thought that decorating the armor with a rarity
made sense, I realized this would allow for duplicate and multiple different types of rarities on
the same armor which isn’t correct. By also spawning a rarity along with an armor I am able to
have the same benefits the factory pattern provides on adding and removing rarities. With this
implementation I am able to spawn a rarity and use it in conjunction with a spawned armor.

Decorator:<br />
The decorator pattern allows for greater flexibility than regular static inheritance. It enhances the
ability to extend attributes of an object through coding new classes. This simplifies the coding by
allowing me to develop a series of attributes from classes instead of coding all the behavior into
a specific object. The decorator pattern was the correct choice for the attributes of the armor
because it allows me to add any combination of attributes to the armor type without needing to
code every single possible combination of the existing attributes beforehand. You could imagine
that the more attributes added, the combinations of attributes exponentially grow. The
decorator pattern also allows me to add and remove attributes with ease and with this pattern I
am easily able to use the rarity type to determine how many attributes to wrap the armor with.

Design Usage<br />
Rarity Generation:<br />
  &emsp;● RarityFactory Interface<br />
    ○ Defines a “spawnRarity” method that takes in enemy string and returns a Rarity<br />
  ● RaritySpawner class<br />
    ○ Implements the Rarity factory and uses a “levelOfEnemy” method to generate the<br />
      level of rarity to be created based on the difficulty of the enemy the user<br />
      defeated.<br />
  ● Rarity abstract class<br />
     ○ Defines the integer object “numOfAttributes” and methods “getDescription” as<br />
        well as “getNumOfAttributes” to be used in each rarity object (common,<br />
        uncommon, rare).<br />
  ● Rarity (Common/Uncommon/rare) class<br />
     ○ Implements the “getDescription method in the Rarity abstract class to return the<br />
        the name of the rarity<br />
     ○ Overwrites the “numOfAttribtues” integer in the Rarity class to equal 1,2 or 3<br />
        (depending on the rarity)<br />
     ○ Implements the “getNumOfAttributes” method by returning the integer<br />
Armour Generation:<br />
  ● ArmourFactory Interface<br />
    ○ Defines a “spawnArmour” method that returns an Armour type to be used in<br />
      “ArmourSpawner”<br />
  ● ArmourSpawner class<br />
    ○ Implements the ArmourFactory and uses spawnArmour to generate and return a<br />
      random Armour.<br />
  ● Armour Abstract class<br />
    ○ Defines the “getDescription” method that will be used in (helmet/chestplate/ring)<br />
      to return a string of the name of armour<br />
    ○ Defines a int “slot” to tell the user which slot the armour is in<br />
  ● Armour (Helmet/ChestPlate/Ring) class<br />
    ○ Implements the Armor abstract class and overwrites the int “slot” in the Armour<br />
      class with the slot number of the armour being generated.<br />
    ○ Implements the “getDescription” method returning a string of the name of the<br />
      armour being generated.<br />
Decorating The Armour:<br />
  ● Factory interface<br />
     ○ Defines a method “wrapArmour” method that takes in an armour and rarity to<br />
      decorate the armour with (used in ArmourDecorator).<br />
     ○ Also defines a “getDescription” method to return to the user (main)<br />
  ● ArmourDecorator class<br />
    ○ Implements the “factory” interface and defines a string “description” object to be<br />
      returned to the user<br />
    ○ Implements a “wrapArmour” method that first adds to the description the slot of<br />
      the armour being wrapped. Adds to the description the rarity name and then the<br />
      armour name. Uses the rarity.getNumOfAttributes call to determine how many<br />
      attributes to decorate the armour with. Randomly generates the attributes in a for<br />
      loop (set to the amount of attributes to add) adding to the description the attribute<br />
      being added each call.<br />
    ○ Implements the “getDescription” method that return the string “description” which<br />
      is the product of the armour, rarity, and attributes added<br />
  ● Attribute (Dexterify/Strength) class<br />
    ○ Implements a default constructor<br />
    ○ Has a “getDescription” method to return the string of the Attribute being<br />
      generated<br />
Other:<br />
  ● Class Enemy<br />
    ○ Used in main class to randomly return a string of the enemy the user defeated to<br />
      be used in the “raritySpawner” class<br />


