package org.example;

/**
 * The type Enchanted room.
 */
class EnchantedRoom extends Room {
    /**
     * Instantiates a new Enchanted room.
     *
     * @param roomNumber    the room number
     * @param isDestination the is destination
     */
    public EnchantedRoom(int roomNumber, boolean isDestination) {
        super(roomNumber, isDestination);
    }

    @Override
    public void enter() {
        System.out.println("You entered an enchanted room.");
    }

}