package org.example;

/**
 * The type Room.
 */
public class Room {
    private int roomNumber;
    private boolean isDestination;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Door northDoor;
    private Door southDoor;
    private Door eastDoor;
    private Door westDoor;

    /**
     * Instantiates a new Room.
     *
     * @param roomNumber    the room number
     * @param isDestination the is destination
     */
    public Room(int roomNumber, boolean isDestination) {
        this.roomNumber = roomNumber;
        this.isDestination = isDestination;
    }

    /**
     * Gets room number.
     *
     * @return the room number
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Is destination boolean.
     *
     * @return the boolean
     */
    public boolean isDestination() {
        return isDestination;
    }

    /**
     * Gets north.
     *
     * @return the north
     */
    public Room getNorth() {
        return north;
    }

    /**
     * Gets south.
     *
     * @return the south
     */
    public Room getSouth() {
        return south;
    }

    /**
     * Gets east.
     *
     * @return the east
     */
    public Room getEast() {
        return east;
    }

    /**
     * Gets west.
     *
     * @return the west
     */
    public Room getWest() {
        return west;
    }

    /**
     * Sets north.
     *
     * @param north the north
     */
    public void setNorth(Room north) {
        this.north = north;
    }

    /**
     * Sets south.
     *
     * @param south the south
     */
    public void setSouth(Room south) {
        this.south = south;
    }

    /**
     * Sets east.
     *
     * @param east the east
     */
    public void setEast(Room east) {
        this.east = east;
    }

    /**
     * Sets west.
     *
     * @param west the west
     */
    public void setWest(Room west) {
        this.west = west;
    }

    /**
     * Sets north door.
     *
     * @param door the door
     */
    public void setNorthDoor(Door door) {
        this.northDoor = door;
    }

    /**
     * Sets south door.
     *
     * @param door the door
     */
    public void setSouthDoor(Door door) {
        this.southDoor = door;
    }

    /**
     * Sets east door.
     *
     * @param door the door
     */
    public void setEastDoor(Door door) {
        this.eastDoor = door;
    }

    /**
     * Sets west door.
     *
     * @param door the door
     */
    public void setWestDoor(Door door) {
        this.westDoor = door;
    }

    /**
     * Gets north door.
     *
     * @return the north door
     */
    public Door getNorthDoor() {
        return northDoor;
    }

    /**
     * Gets south door.
     *
     * @return the south door
     */
    public Door getSouthDoor() {
        return southDoor;
    }

    /**
     * Gets east door.
     *
     * @return the east door
     */
    public Door getEastDoor() {
        return eastDoor;
    }

    /**
     * Gets west door.
     *
     * @return the west door
     */
    public Door getWestDoor() {
        return westDoor;
    }

    /**
     * Enter.
     */
    public void enter() {
        System.out.println("You entered a generic room.");
    }
}
