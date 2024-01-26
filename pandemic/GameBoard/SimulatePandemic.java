package upei.GameBoard;

import upei.player.Player;
import upei.variables.Piece;
import upei.variables.Variables;

/**
 * SimulatePandemic class simulates the Pandemic board game and controls the game flow.
 */
public class SimulatePandemic {
    // Boolean attributes indicating the game state
    public static boolean gameOver;
    public static boolean gameWon;
    public static boolean gameLost;

    // The Game Board contains all the objects of the game.
    public GameBoard gameBoard;

    // An array of the players who are playing
    public Player[] gamePlayers;

    /**
     * Constructor for a Pandemic game. Creates a new instance of a GameBoard object with adjustable features.
     * Requires an array of players to be provided.
     */
    public SimulatePandemic(Player[] currentGamePlayers) {
        // Output game setup information
        System.out.println("Setting up a new game of Pandemic with the below features.");
        System.out.println("4 Colours of disease.");
        System.out.println("4 cards of the same colour must be discarded at a research station to cure a disease.");
        System.out.println("4 is the maximum number of epidemics.");
        System.out.println("Any more than 8 outbreaks and the game will be lost");
        System.out.println("The initial infection step will see 9 cities infected ");
        System.out.println("Between all players, a maximum of 8 cards are drawn at the start of the game");
        System.out.println("There are 5 research stations which can be placed, and 1 (min 1) is placed at the start of the game");

        // Initialise instance variables
        int startingHandSize;
        gameBoard = new GameBoard();
        gamePlayers = currentGamePlayers;

        // Set the players to the game board
        sitPlayersDown();
        gameBoard.startGame();
        startingHandSize = calcHandSize();
        drawHands(startingHandSize);
        placePieces();
        gameOver = false;
    }

    /**
     * Main method to start a new game and simulate its progress.
     */
    public static void main(String[] args) {
        System.out.println("Starting a new game");
        SimulatePandemic testgame;
        Player OPERATIONS_EXPERT;
        Player MEDIC;
        Player SCIENTIST;
        Player QUARANTINE_SPECIALIST;

        MEDIC = new Player("MEDIC", "MEDIC");
        OPERATIONS_EXPERT = new Player("OPERATIONS_EXPERT", "OPERATIONS_EXPERT");
        SCIENTIST = new Player("SCIENTIST", "SCIENTIST");
        QUARANTINE_SPECIALIST = new Player("QUARANTINE_SPECIALIST", "QUARANTINE_SPECIALIST");
        Player[] currentPlayers;
        currentPlayers = new Player[4];
        currentPlayers[0] = OPERATIONS_EXPERT;
        currentPlayers[1] = SCIENTIST;
        currentPlayers[2] = MEDIC;
        currentPlayers[3] = QUARANTINE_SPECIALIST;

        testgame = new SimulatePandemic(currentPlayers);

        testgame.playGame();
    }

    // Prints "looser" message
    public static void looserPrint() {
        for (int i = 0; i < 5; i++) {
            System.out.println("THE CIVILIZATION IS DEAD!");
        }
    }

    /**
     * Play the game until it's over.
     */
    public void playGame() {
        int i;
        int turns = 0;
        while (!gameOver) {
            i = gamePlayers.length;
            while (i > 0 && !gameOver) {
                i = i - 1;
                while (gamePlayers[i].getPlayerAction() > 0 && !gameOver) {
                    gamePlayers[i].makeDecision();
                    checkGameOver();
                }
                if (!checkGameOver()) {
                    System.out.println(gamePlayers[i].getPlayerName() + " completed 4 actions");
                    gamePlayers[i].drawCard(2);
                    gameBoard.infectCityPhase(gameBoard.getInfectionRate());
                }
                checkGameOver();
            }

            turns++;
            if (!checkGameOver()) {
                System.out.println("Ending turn " + turns + ", everybody has had a go.");
            }
            resetAllPlayerAction();
        }
    }

    /**
     * Check if the game is over and print the appropriate message.
     *
     * @return True if the game is over.
     */
    public boolean checkGameOver() {
        if (checkGameWon()) {
            for (int i = 0; i < 5; i++) {
                System.out.println("YOU WIN!!!");
            }
            gameOver = true;
        }
        checkGameLost();
        return gameOver;
    }

    /**
     * Check if the game is lost based on specific conditions.
     */
    public void checkGameLost() {
        if (gameBoard.getOutbreakCount() > Variables.MAX_NUMBER_OF_OUTBREAK) {
            System.out.println("Game over, too many outbreaks!");
            gameLost = true;
            gameOver = true;
            looserPrint();
        } else if (gameBoard.emptyDeck()) {
            System.out.println("That's it, game over, no more cards.");
            gameLost = true;
            gameOver = true;
            looserPrint();
        }
    }

    /**
     * Reset all players' actions to 4.
     */
    public void resetAllPlayerAction() {
        int i = gamePlayers.length;
        while (i > 0) {
            i--;
            gamePlayers[i].resetPlayerAction();
        }
    }

    /**
     * Place player pieces on the board.
     */
    public void placePieces() {
        int i = gamePlayers.length;
        while (i > 0) {
            gameBoard.playerPieces[i - 1] = new Piece(gamePlayers[i - 1], gameBoard, Variables.algiers);
            gamePlayers[i - 1].setPlayerPiece(gameBoard.playerPieces[i - 1]);
            i = i - 1;
        }
    }

    /**
     * Calculate initial hand size based on the number of players.
     *
     * @return Initial hand size.
     */
    public int calcHandSize() {
        int i = gamePlayers.length;
        int toReturn = 0;
        if (i == 2) {
            toReturn = 4;
        } else if (i == 3) {
            toReturn = 3;
        } else if (i == 4) {
            toReturn = 2;
        }
        return toReturn;
    }

    /**
     * Draw initial hands for each player.
     *
     * @param handSize Initial hand size.
     */
    public void drawHands(int handSize) {
        int i = gamePlayers.length;
        while (i > 0) {
            System.out.println("Drawing hand for " + gamePlayers[i - 1].getPlayerName());
            gamePlayers[i - 1].drawCard(handSize);
            i = i - 1;
        }
    }

    /**
     * Check if the game is won by curing all diseases.
     *
     * @return True if the game is won.
     */
    public boolean checkGameWon() {
        boolean isWon = true;
        for (int i = 0; i < gameBoard.diseases.size(); i++) {
            isWon = isWon && gameBoard.diseases.get(i).getCured();
        }
        gameWon = isWon;
        return isWon;
    }

    /**
     * Set up players and associate them with the game board.
     */
    public void sitPlayersDown() {
        int i = gamePlayers.length;
        while (i > 0) {
            System.out.println(gamePlayers[i - 1].getPlayerName() + " has joined the game");
            gamePlayers[i - 1].setGameBoard(gameBoard);
            i = i - 1;
        }
    }
}
