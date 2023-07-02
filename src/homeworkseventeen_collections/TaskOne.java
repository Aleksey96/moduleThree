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

    public static void printAllGames(SiteGamers siteGamers) {
        siteGamers.printGamesAllPlayers();
    }

    public static void printRatingOfGamer(String game, String nikName, SiteGamers siteGamers) {
        siteGamers.printRating(game, nikName);
    }

    public static void addRating(String nikName, String game, String resultGame, SiteGamers siteGamers) {
        switch (resultGame.toLowerCase()) {
            case "win":
                siteGamers.addRatingGamer(nikName, game, 50);
                break;
            default:
                System.out.println("Result does`t exist or " + nikName + " lose");
        }
    }




    public static void main(String[] args) {
        SiteGamers siteGamers = new SiteGamers();
        registerGamer("Alex", siteGamers, new String[]{"Fool", "Spider", "Soliter"});
        registerGamer("Paul", siteGamers, new String[]{"Mass effect", "GTA", "Fool", "World of Tanks"});
        registerGamer("Alex", siteGamers, new String[]{"Fool","FarCry", "Spider", "BattleField", "Mafia", "Witcher"});
        registerGamer("Devid", siteGamers, new String[]{"Fool","GTA", "World of Tanks", "Soliter"});
        registerGamer("Boris", siteGamers, new String[]{"Fool","World of Tanks", "Captain Morgan"});
        registerGamer("Masha", siteGamers, new String[]{"Fool","GTA", "Warcraft", "Starcraft", "Witcher"});
        registerGamer("Victor", siteGamers, new String[]{"Fool","Starcraft", "Assassin", "Spider", "GTA"});
        registerGamer("Boris", siteGamers, new String[]{"Fool","World of Tanks", "Captain Morgan"});
        registerGamer("John", siteGamers, new String[]{"Fool","GTA", "Spider", "World of Tanks"});
        registerGamer("Jack", siteGamers, new String[]{"Fool", "BattleField", "Starcraft", "FarCry", "Captain Morgan"});
        siteGamers.printGamers();

        printAllGames(siteGamers);
        addRating("Paul", "World of Tanks", "WIN", siteGamers);
        addRating("John", "World of Tanks", "lose", siteGamers);
        addRating("Alex", "World of Tanks", "Win", siteGamers);

        addRating("Alex", "World of Tanks", "WN", siteGamers);
        addRating("Aleksey", "World of Tanks", "Win", siteGamers);

        printRatingOfGamer("World of Tanks", "Paul", siteGamers);
        printRatingOfGamer("World of Tanks", "John", siteGamers);
        printRatingOfGamer("World of Tanks", "Alexey", siteGamers);
        printRatingOfGamer("World of tanks", "Jack", siteGamers);

        //siteGamers.getListGamers()


    }
}
