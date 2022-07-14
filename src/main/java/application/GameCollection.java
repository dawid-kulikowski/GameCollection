package application;

import java.util.ArrayList;
import java.util.Scanner;

public class GameCollection {
    static Scanner scanner = new Scanner(System.in);
    Game game = new Game();
    static ArrayList<Game> gameLibrary = new ArrayList<>();
    public GameCollection() {
    }

    public GameCollection( Game game) {
        this.game = game;
    }


    public Scanner getScanner() {
        return scanner;
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
            case 1: addToCollection(); menu(); break;
            case 2: deleteTitle(); break;
            case 3: updateTitle(); break;
            case 4: showCollection();break;
            default: menu();
        }
        addToCollection();
    }


     static void addToCollection () {
         Game game = new Game();
         GameCondition gameCondition = new GameCondition();
         System.out.println("TITLE:");
         game.setTitle(scanner.next());
        //fix enums
        System.out.println("PLATFORM: ");
        switch (scanner.nextInt()) {
            case 1: game.setPlatform(Platform.PSX); break;
            case 2: game.setPlatform(Platform.PS2); break;
            case 3: game.setPlatform(Platform.PS3); break;
            case 4: game.setPlatform(Platform.PS4); break;
            case 5: game.setPlatform(Platform.XBOX); break;
            case 6: game.setPlatform(Platform.XBOX360); break;
            case 7: game.setPlatform(Platform.XONE); break;
            case 8: game.setPlatform(Platform.WII); break;
            case 9: game.setPlatform(Platform.NGC); break;
            default: return;
        }

        System.out.println("LANGUAGE: ");
        switch (scanner.nextInt()) {
            case 1: game.setGameLanguage(GameLanguage.PL); break;
            case 2: game.setGameLanguage(GameLanguage.ENG); break;
            case 3: game.setGameLanguage(GameLanguage.DE); break;
            case 4: game.setGameLanguage(GameLanguage.FR); break;
            case 5: game.setGameLanguage(GameLanguage.ESP); break;
            default: return;
        }
        System.out.println("COVER LANGUAGE: ");
        switch (scanner.nextInt()) {
            case 1: game.setCoverLanguage(CoverLanguage.PL); break;
            case 2: game.setCoverLanguage(CoverLanguage.ENG); break;
            case 3: game.setCoverLanguage(CoverLanguage.DE); break;
            case 4: game.setCoverLanguage(CoverLanguage.FR); break;
            case 5: game.setCoverLanguage(CoverLanguage.ESP); break;
            default: return;
        }
        System.out.println("DISC CONDITION: ");
        gameCondition.setDiscCondition(scanner.nextDouble());
        System.out.println("BOOK CONDITION: ");
        gameCondition.setBookCondition(scanner.nextDouble());
        System.out.println("COVER CONDITION: ");
        gameCondition.setCoverCondition(scanner.nextDouble());
        System.out.println("BOX CONDITION: ");
        gameCondition.setBoxCondition(scanner.nextDouble());
        game.setGameCondition(gameCondition);
        System.out.println("CHEAPEST SELL PRICE IN PLN: ");
        game.setEstimatedPrice(scanner.nextDouble());
        gameLibrary.add(game);
     }

    static void updateTitle(){
        System.out.println("Update");
    }

    static void deleteTitle(){
        System.out.println("Delete");
    }

    static void showCollection(){
        System.out.println("YOUR COLLECTION: \n");
        for (Game game : gameLibrary) {
            System.out.println(game.toString());
        }
    }

}
