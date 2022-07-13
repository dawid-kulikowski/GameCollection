package application;

public class Game {
    String title;
    Platform platform;
    Language language;
    GameCondition gameCondition;
    double estimatedPrice;

    public Game(String title, Platform platform, Language language, GameCondition gameCondition, double estimatedPrice) {
        this.title = title;
        this.platform = platform;
        this.language = language;
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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
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
}
