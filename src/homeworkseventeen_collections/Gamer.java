package homeworkseventeen_collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Gamer {
    private String nikName;
    private List<String> listGames;
    private HashMap<String, Integer> tableRatingGamer;

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        this.nikName = nikName;
    }

    Gamer(String nikName, String[] games) {
        this.nikName = nikName;
        listGames = Arrays.asList(games);
        tableRatingGamer = new HashMap<>();
        for (String game : listGames) {
            tableRatingGamer.put(game, 0);
        }
    }

    public void changeRatingGamer(String game, String nikName, Integer rating) {
        if (tableRatingGamer.containsKey(game)) {
            tableRatingGamer.replace(game, tableRatingGamer.get(game) + rating);
        } else {
            System.out.println("В игру " + game + " " + nikName + " не играет");
        }
    }

    public void printRatingGamer(String game) {
        if (tableRatingGamer.containsKey(game)) {
            System.out.println("Рейтинг игрока " + nikName + " в игре " + game + ": " + tableRatingGamer.get(game));
        } else {
            System.out.println("В игру " + game + " " + nikName + " не играет");
        }
    }

    public void printTableResultCurrentGamer() {
        System.out.println(tableRatingGamer);
    }

    public List<String> getListGames() {
        return listGames;
    }

    public HashMap<String, Integer> getTableRatingGamer() {
        return tableRatingGamer;
    }

    public void setTableRatingGamer(String game, Integer rating) {
        this.tableRatingGamer = tableRatingGamer;
    }

    @Override
    public String toString() {
        String listPlays = String.join(", ", listGames);
        return "Gamer " + nikName + ": " + listPlays;
    }
}