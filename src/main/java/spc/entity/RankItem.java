package spc.entity;

import java.util.Objects;

public class RankItem {
    private User user;
    private int score;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RankItem rankItem = (RankItem) o;
        return score == rankItem.score &&
                Objects.equals(user, rankItem.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, score);
    }
}
