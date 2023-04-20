package org.example;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //enhanced maze
        MazeGame game = new MazeGame();

        // Create and play the regular maze game
        MazeFactory factory = new MazeFactory();
        Maze maze = game.createLongMaze(factory);
        game.playGame(maze);

        // Create and play the enhanced maze game
        EnchantedMazeFactory enchantedFactory = new EnchantedMazeFactory();
//        Maze enhancedMaze = game.createSimpleEnhancedMaze(enchantedFactory);
        Maze enhancedMaze = game.createLongEnhancedMaze(enchantedFactory);
        game.playEnhancedGame(enhancedMaze);



    }
}



