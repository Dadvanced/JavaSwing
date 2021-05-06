package entities;

public class Player {
    private String name;
    private int score;
    private int life;

    // CONSTRUCTORS
    public Player() {}
    
    public Player(String name) {
        this.name = name;
        this.life = 5;
    }
    
    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    
    // METHODS
    public void lessLife(int amount) {
        this.life -= amount;
    }
    
    public void moreLife(int amount) {
        this.life += amount;
    }
    
    public void lessScore(int amount) {
        this.score -= amount;
    }
    
    public void moreScore(int amount) {
        this.score += amount;
    }
}
