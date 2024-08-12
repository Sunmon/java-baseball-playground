package baseball;

import java.util.Objects;

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
}
