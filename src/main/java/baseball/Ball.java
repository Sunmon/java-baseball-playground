package baseball;

public class Ball {
    private final int value;

    public Ball() {
        this.value = getRandNum();
    }

    public Ball(int value) {
        this.value = value;
    }

    public int getRandNum() {
        return (int)(Math.random()*9) + 1;
    }

    public boolean isEqualTo(Ball user) {
        return user.value == this.value;
    }
}
