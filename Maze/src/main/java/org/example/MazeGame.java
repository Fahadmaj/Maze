package org.example;

import java.util.Scanner;

/**
 * The type Maze game.
 */
public class MazeGame {
    private boolean spell = false;

    private int spellHave=0;

    /**
     * Has spell boolean.
     *
     * @return the boolean
     */
    public boolean hasSpell() {
        return spell;
    }

    /**
     * Use spell.
     */
    public void useSpell() {
        spellHave -= 1;
        if (spellHave<=0)
            spell=false;
    }


    /**
     * Create simple maze maze.
     *
     * @param factory the factory
     * @return the maze
     */
    public Maze createSimpleMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();

        Room room1 = factory.makeRoom(1, false);
        Room room2 = factory.makeRoom(2, true);
        Door door = factory.makeDoor(room1, room2);

        room1.setEast(room2);
        room2.setWest(room1);

        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }

    /**
     * Create long maze maze.
     *
     * @param factory the factory
     * @return the maze
     */
    public Maze createLongMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();

        Room room1 = factory.makeRoom(1, false);
        Room room2 = factory.makeRoom(2, false);
        Room room3 = factory.makeRoom(3, false);
        Room room4 = factory.makeRoom(4, false);
        Room room5 = factory.makeRoom(5, true);

        Door door1 = factory.makeDoor(room1, room2);
        Door door2 = factory.makeDoor(room1, room3);
        Door door3 = factory.makeDoor(room2, room4);
        Door door4 = factory.makeDoor(room3, room4);
        Door door5 = factory.makeDoor(room4, room5);

        room1.setEast(room2);
        room1.setSouth(room3);
        room2.setWest(room1);
        room2.setSouth(room4);
        room3.setNorth(room1);
        room3.setEast(room4);
        room4.setNorth(room2);
        room4.setWest(room3);
        room4.setEast(room5);
        room5.setWest(room4);

        maze.addRoom(room1);
        maze.addRoom(room2);
        maze.addRoom(room3);
        maze.addRoom(room4);
        maze.addRoom(room5);

        return maze;
    }

    /**
     * Create simple enhanced maze maze.
     *
     * @param factory the factory
     * @return the maze
     */
    public Maze createSimpleEnhancedMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();

        Room room1 = factory.makeRoom(1, false);
        Room room2 = factory.makeRoom(2, true);
        Door door = factory.makeDoor(room1, room2);

        room1.setEast(room2);
        room1.setEastDoor(door);

        room2.setWest(room1);
        room2.setWestDoor(door);

        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }

    /**
     * Create long enhanced maze maze.
     *
     * @param factory the factory
     * @return the maze
     */
    public Maze createLongEnhancedMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();

        Room room1 = factory.makeRoom(1, false);
        Room room2 = factory.makeRoom(2, false);
        Room room3 = factory.makeRoom(3, false);
        Room room4 = factory.makeRoom(4, false);
        Room room5 = factory.makeRoom(5, true);

        Door door12 = factory.makeDoor(room1, room2);
        Door door13 = factory.makeDoor(room1, room3);
        Door door24 = factory.makeDoor(room2, room4);
        Door door34 = factory.makeDoor(room3, room4);
        Door door45 = factory.makeDoor(room4, room5);

        room1.setEast(room2);
        room1.setEastDoor(door12);
        room1.setSouth(room3);
        room1.setSouthDoor(door13);

        room2.setWest(room1);
        room2.setWestDoor(door12);
        room2.setSouth(room4);
        room2.setSouthDoor(door24);

        room3.setNorth(room1);
        room3.setNorthDoor(door13);
        room3.setEast(room4);
        room3.setEastDoor(door34);

        room4.setNorth(room2);
        room4.setNorthDoor(door24);
        room4.setWest(room3);
        room4.setWestDoor(door34);
        room4.setEast(room5);
        room4.setEastDoor(door45);

        room5.setWest(room4);
        room5.setWestDoor(door45);

        maze.addRoom(room1);
        maze.addRoom(room2);
        maze.addRoom(room3);
        maze.addRoom(room4);
        maze.addRoom(room5);

        return maze;
    }


    /**
     * Play game.
     *
     * @param maze the maze
     */
    public void playGame(Maze maze) {
        Scanner scanner = new Scanner(System.in);
        Room currentRoom = maze.getRoom(1);

        while (!currentRoom.isDestination()) {
            System.out.println("You are in room " + currentRoom.getRoomNumber());
            System.out.print("Enter direction (north, south, east, west): ");
            String direction = scanner.nextLine().toLowerCase();
            Room nextRoom = null;

            switch (direction) {
                case "north":
                    nextRoom = currentRoom.getNorth();
                    break;
                case "south":
                    nextRoom = currentRoom.getSouth();
                    break;
                case "east":
                    nextRoom = currentRoom.getEast();
                    break;
                case "west":
                    nextRoom = currentRoom.getWest();
                    break;
                default:
                    System.out.println("Invalid direction.");
                    continue;
            }

            if (nextRoom == null) {
                System.out.println("There is no room in that direction.");
            } else {
                currentRoom = nextRoom;
                currentRoom.enter();
            }
        }

        System.out.println("Congratulations! You have reached the destination room.");
    }

    /**
     * Play enhanced game.
     *
     * @param maze the maze
     */
    public void playEnhancedGame(Maze maze) {
        Scanner scanner = new Scanner(System.in);
        Room currentRoom = maze.getRoom(1);

        while (!currentRoom.isDestination()) {
            System.out.println("You are in room " + currentRoom.getRoomNumber());
            System.out.print("Enter direction (north, south, east, west, getspell): ");
            String direction = scanner.nextLine().toLowerCase();

            Room nextRoom = null;
            Door door = null;

            if ("getspell".equals(direction)) {
                if (!spell) {
                    spell = true;
                    System.out.println("You found a spell!");
                } else {
                    System.out.println("You already have a spell!");
                }
                continue;
            }

            switch (direction) {
                case "north":
                    door = currentRoom.getNorthDoor();
                    break;
                case "south":
                    door = currentRoom.getSouthDoor();
                    break;
                case "east":
                    door = currentRoom.getEastDoor();
                    break;
                case "west":
                    door = currentRoom.getWestDoor();
                    break;
                default:
                    System.out.println("Invalid direction.");
                    continue;
            }

            if (door != null && door.isOpen()) {
                nextRoom = door.getOtherSide(currentRoom);
                door.enter(this); // Pass the game instance
            } else if (door != null) {
                door.enter(this); // Pass the game instance
                continue;
            } else {
                System.out.println("There is no door in that direction.");
                continue;
            }

            currentRoom = nextRoom;
            currentRoom.enter();
        }

        System.out.println("Congratulations! You have reached the destination room.");
    }
}
