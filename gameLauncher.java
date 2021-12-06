import java.sql.Savepoint;

class RockPaperScissor {
    Player p1;
    Player p2;

    void startGame() {
        p1 = new Player();
        p2 = new Player();
    }
}

class Player {
    String name;
    char said;
    char said2;
    char[] rps = {'r', 'p', 's'};

    void say() {
        int index = (int) (Math.random() * 3);
        said = rps[index];
        System.out.println(name + " said " + said);
        
        int index2 = (int )(Math.random() *3);
        said2 =rps[index2];

        System.out.println(name +"said" +said);

        


    }
}

public class gameLauncher {
    public static void main(String[] args) {
        RockPaperScissor game = new RockPaperScissor ();
    }

}

