package org.example;

/**
 * The type Door needing spell.
 */
public class DoorNeedingSpell extends Door {
    private boolean open;

    /**
     * Instantiates a new Door needing spell.
     *
     * @param room1 the room 1
     * @param room2 the room 2
     */
    public DoorNeedingSpell(Room room1, Room room2) {
        super(room1, room2);
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public void enter(MazeGame game) {
        if (!isOpen()) {
            if (game.hasSpell()) {
                setOpen(true);
                game.useSpell(); // Add this line to use up the spell after opening the door
                System.out.println("You used the spell and opened the door needing a spell.");
            } else {
                System.out.println("You need a spell to open this door!");
            }
        } else {
            super.enter(game);
        }
    }

}
