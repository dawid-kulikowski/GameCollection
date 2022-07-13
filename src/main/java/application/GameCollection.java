package application;

import java.util.ArrayList;
import java.util.Scanner;

public class GameCollection {
    static Scanner scanner = new Scanner(System.in);
    Game game = new Game();
    static ArrayList<Game> gameCollection = new ArrayList<>();
    public GameCollection() {
    }

    public GameCollection(Scanner scanner, Game game) {

        this.scanner = scanner;
        this.game = game;
    }


    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public static void menu(){
        System.out.println("WELCOME IN GAME COLLECTION APP");
        System.out.println("1. ADD TO COLLECTION.");
        System.out.println("2. REMOVE FROM COLLECTION.");
        System.out.println("3. UPDATE TITLE.");
        System.out.println("4. GAME COLLECTION.");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1: addToCollection(); menu();
            case 2: deleteTitle();
            case 3: updateTitle();
            case 4: showCollection();
            default: menu();
        }
        addToCollection();
    }


     static void addToCollection () {
//         Scanner scanner = new Scanner(System.in);
         Game game = new Game();
         GameCondition gameCondition = new GameCondition();
         System.out.println("TITLE: ");
        game.setTitle(scanner.next());
        //fix enums
        System.out.println("PLATFORM: ");
        game.setPlatform(Platform.XONE);
        System.out.println("LANGUAGE: ");
        game.setLanguage(Language.ENG);
        System.out.println("DISC CONDITION: ");
        gameCondition.setDiscCondition(scanner.nextDouble());
        System.out.println("BOOK CONDITION: ");
        gameCondition.setBookCondition(scanner.nextDouble());
        System.out.println("COVER CONDITION: ");
        gameCondition.setCoverCondition(scanner.nextDouble());
        System.out.println("BOX CONDITION: ");
        gameCondition.setBoxCondition(scanner.nextDouble());
        game.setGameCondition(gameCondition);
        gameCollection.add(game);
     }

    static void updateTitle(){
        System.out.println("Update");
    }

    static void deleteTitle(){
        System.out.println("Delete");
    }

    static void showCollection(){
        for (Game game : gameCollection) {
            System.out.println(game.toString());
        }
        System.out.println("Delete");
    }

}
