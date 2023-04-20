package org.example;

/**
 * The type Door.
 */
public class Door {
    private Room room1;
    private Room room2;
    private boolean isOpen;

    /**
     * Instantiates a new Door.
     *
     * @param room1 the room 1
     * @param room2 the room 2
     */
    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }

    /**
     * Gets other side.
     *
     * @param room the room
     * @return the other side
     */
    public Room getOtherSide(Room room) {
        if (room == room1) {
            return room2;
        } else {
            return room1;
        }
    }

    /**
     * Is open boolean.
     *
     * @return the boolean
     */
    public boolean isOpen() {
        return isOpen;
    }

    /**
     * Sets open.
     *
     * @param open the open
     */
    public void setOpen(boolean open) {
        isOpen = open;
    }

    /**
     * Enter.
     *
     * @param game the game
     */
    public void enter(MazeGame game) {
        System.out.println("You entered a generic door.");
    }
}
