package homeworkseventeen_collections;

import java.util.ArrayList;
import java.util.List;

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
}
