package homeworkseventeen_collections;

public class TaskOne {

    public static void registerGamer(String nikName, SiteGamers siteGamers, String[] games) {
        var listGamers = siteGamers.getListGamers();
        if (listGamers.size() == 0) {
            siteGamers.addGamer(new Gamer(nikName, games));
        } else {
            if (siteGamers.checkContainsGamer(nikName)) {
                System.out.println("Игрок с ником " + nikName + " уже зарегестрирован");
            } else {
                siteGamers.addGamer(new Gamer(nikName, games));
            }
        }
    }


    public static void main(String[] args) {
        SiteGamers siteGamers = new SiteGamers();
        registerGamer("Alex", siteGamers, new String[]{"Fool", "Spider", "Soliter"});
        registerGamer("Paul", siteGamers, new String[]{"Mass effect", "GTA", "Fool", "World of Tanks"});
        registerGamer("Alex", siteGamers, new String[]{"FarCry", "Spider", "BattleField", "Mafia", "Witcher"});
        registerGamer("Devid", siteGamers, new String[]{"GTA", "World of Tanks", "Soliter"});
        registerGamer("Boris", siteGamers, new String[]{"World of Tanks", "Captain Morgan"});
        registerGamer("Masha", siteGamers, new String[]{"GTA", "Warcraft", "Starcraft", "Witcher"});
        registerGamer("Victor", siteGamers, new String[]{"Starcraft", "Assassin", "Spider", "GTA"});
        registerGamer("Boris", siteGamers, new String[]{"World of Tanks", "Captain Morgan"});
        registerGamer("John", siteGamers, new String[]{"GTA", "Spider", "World of tanks"});
        registerGamer("Jack", siteGamers, new String[]{"Fool", "BattleField", "Starcraft", "FarCry", "Captain Morgan"});
        siteGamers.printGamers();
    }
}
