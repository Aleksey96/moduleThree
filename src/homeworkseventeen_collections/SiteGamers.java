package homeworkseventeen_collections;

import java.util.*;

public class SiteGamers {

    private List<Gamer> listGamers = new ArrayList<>();

    public List<Gamer> getListGamers() {
        return listGamers;
    }

    public void printGamers() {
        for (Gamer player : listGamers) {
            System.out.println(player);
        }
    }


    public void addGamer(Gamer gamer) {
        listGamers.add(gamer);
    }

    public void addRatingGamer(String nikName, String game, Integer rating) {
        Gamer gamer = getGamer(nikName);
        if (gamer != null) {
            gamer.changeRatingGamer(game, nikName, rating);
        } else {
            System.out.println("Игрока c ником " + nikName + " не существует");
        }
    }

    public void printRating(String game, String nikName) {
        Gamer gamer = getGamer(nikName);
        if (gamer != null) {
            gamer.printRatingGamer(game);
        } else {
            System.out.println("Игрока c ником " + nikName + " не существует");
        }
    }


    public boolean checkContainsGamer(String nikName) {
        boolean check = false;
        for (int i = 0; i < listGamers.size(); i++) {
            if (listGamers.get(i).getNikName().equals(nikName)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public Gamer getGamer(String nikName) {
        for (int i = 0; i < listGamers.size(); i++) {
            if (listGamers.get(i).getNikName().equals(nikName)) {
                return listGamers.get(i);
            }
        }
        return null;
    }

    public Set<String> createListAllGames() {
        HashSet<String> listAllGames = new HashSet<>();
        for (Gamer gamer : listGamers) {
            listAllGames.addAll(gamer.getListGames());
        }
        return listAllGames;
    }

    public void printGamesAllPlayers() {
        System.out.println("Игры, в которые играют игроки: " + createListAllGames());
    }

    //Map.Entry


}
