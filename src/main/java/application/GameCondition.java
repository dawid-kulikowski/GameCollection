package application;

public class GameCondition {
    double discCondition;
    double boxCondition;
    double bookCondition;
    double coverCondition;

    public GameCondition() {
    }

    public GameCondition(double discCondition, double boxCondition, double bookCondition, double coverCondition) {
        this.discCondition = discCondition;
        this.boxCondition = boxCondition;
        this.bookCondition = bookCondition;
        this.coverCondition = coverCondition;
    }

    public double getDiscCondition() {
        return discCondition;
    }

    public void setDiscCondition(double discCondition) {
        this.discCondition = discCondition;
    }

    public double getBoxCondition() {
        return boxCondition;
    }

    public void setBoxCondition(double boxCondition) {
        this.boxCondition = boxCondition;
    }

    public double getBookCondition() {
        return bookCondition;
    }

    public void setBookCondition(double bookCondition) {
        this.bookCondition = bookCondition;
    }

    public double getCoverCondition() {
        return coverCondition;
    }

    public void setCoverCondition(double coverCondition) {
        this.coverCondition = coverCondition;
    }
}


