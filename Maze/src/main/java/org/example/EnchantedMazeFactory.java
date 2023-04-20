package org.example;

/**
 * The type Enchanted maze factory.
 */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(int roomNumber, boolean isDestination) {
        return new EnchantedRoom(roomNumber, isDestination);
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}

