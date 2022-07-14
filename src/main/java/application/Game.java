package application;

public class Game {
    String title;
    Platform platform;
    GameLanguage gameLanguage;
    CoverLanguage coverLanguage;
    GameCondition gameCondition;
    double estimatedPrice;

    public Game(String title, Platform platform, GameLanguage gameLanguage, CoverLanguage coverLanguage, GameCondition gameCondition, double estimatedPrice) {
        this.title = title;
        this.platform = platform;
        this.gameLanguage = gameLanguage;
        this.coverLanguage = coverLanguage;
        this.gameCondition = gameCondition;
        this.estimatedPrice = estimatedPrice;
    }

    public Game() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public GameCondition getGameCondition() {
        return gameCondition;
    }

    public void setGameCondition(GameCondition gameCondition) {
        this.gameCondition = gameCondition;
    }

    public double getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(double estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public GameLanguage getGameLanguage() {
        return gameLanguage;
    }

    public void setGameLanguage(GameLanguage gameLanguage) {
        this.gameLanguage = gameLanguage;
    }

    public CoverLanguage getCoverLanguage() {
        return coverLanguage;
    }

    public void setCoverLanguage(CoverLanguage coverLanguage) {
        this.coverLanguage = coverLanguage;
    }

    @Override
    public String toString() {
        return "TITLE: " + title +
                "\nPLATFORM: " + platform +
                "\nGAME LANGUAGE: " + gameLanguage +
                "\nCOVER LANGUAGE: " + coverLanguage +
                "\nGAME CONDITION: " + gameCondition.toString() +
                "\nESTIMATED PRICE: " + estimatedPrice;
    }
}
