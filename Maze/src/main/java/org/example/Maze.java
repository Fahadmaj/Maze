package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Maze.
 */
public class Maze {
    private Map<Integer, Room> rooms;

    /**
     * Instantiates a new Maze.
     */
    public Maze() {
        rooms = new HashMap<>();
    }

    /**
     * Add room.
     *
     * @param room the room
     */
    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    }

    /**
     * Gets room.
     *
     * @param roomNumber the room number
     * @return the room
     */
    public Room getRoom(int roomNumber) {
        return rooms.get(roomNumber);
    }
}
