package org.example;

/**
 * The type Maze factory.
 */
public class MazeFactory {
    /**
     * Make maze maze.
     *
     * @return the maze
     */
    public Maze makeMaze() {
        return new Maze();
    }

    /**
     * Make wall wall.
     * No use at the moment
     * @return the wall
     */
    public Wall makeWall() {
        return new Wall();
    }

    /**
     * Make room room.
     *
     * @param roomNumber    the room number
     * @param isDestination the is destination
     * @return the room
     */
    public Room makeRoom(int roomNumber, boolean isDestination) {
        return new Room(roomNumber, isDestination);
    }

    /**
     * Make door door.
     *
     * @param r1 the r 1
     * @param r2 the r 2
     * @return the door
     */
    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
