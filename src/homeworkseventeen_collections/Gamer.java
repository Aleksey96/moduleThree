package homeworkseventeen_collections;

import java.util.Arrays;
import java.util.List;

public class Gamer {
    private String nikName;
    private List<String> listGames;

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        this.nikName = nikName;
    }

    Gamer(String nikName, String[] games) {
        this.nikName = nikName;
        listGames = Arrays.asList(games);
    }

    @Override
    public String toString() {
        String listPlays = String.join("; ", listGames);
        return "Gamer " + nikName + ": " + listPlays;
    }
}