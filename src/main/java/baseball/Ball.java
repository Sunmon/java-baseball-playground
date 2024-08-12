package baseball;

import java.util.Objects;

public class Ball {
    private final int value;

    private int pos;

    public Ball() {
        this.value = getRandNum();
        pos = 0;
    }

    public Ball(int value, int pos) {
        this.value = value;
        this.pos = pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getRandNum() {
        return (int)(Math.random()*9) + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return value == ball.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public GameResult getResult(Ball user) {
        if (this.equals(user) && this.pos == user.pos) {
            return GameResult.STRIKE;
        }

        if (this.equals(user)) {
            return GameResult.BALL;
        }

        return GameResult.NOTHING;
    }
}
