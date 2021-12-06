class RockPaperScissor {
    Player p1;
    Player p2;

    void startGame() {
        p1 = new Player();
        p2 = new Player();
        p1.name = "Chandra";
        p2.name = "Shyam";
        
        // playing the game
        while (true)
        {
            // players playing the game
            p1.play();
            p2.play();

            if (p1.said == p2.said) {
                System.out.println("It's a tie! Try again...\n");
            }
            else {
                Player winner = checkWinner(p1, p2);
                System.out.println("We have a winner!");
                System.out.println("Congratulations " + winner.name + ". You won!!");
                break;
            }
        }
    }
    
    Player checkWinner(Player p1, Player p2) {
        if (p1.said == "Rock" && p2.said == "Paper") {
            return p2;
        }
        else if (p1.said == "Rock" && p2.said == "Scissor") {
            return p1;
        }
        else if (p1.said == "Paper" && p2.said == "Rock") {
            return p1;
        }
        else if (p1.said == "Paper" && p2.said == "Scissor") {
            return p2;
        }
        else if (p1.said == "Scissor" && p2.said == "Rock") {
            return p2;
        }
        else {
            return p1;
        }
    }
}

class Player {
    String name;
    String said;
    String[] rps = {"Rock", "Paper", "Scissor"};

    void play() {
        int index = (int) (Math.random() * 3);
        said = rps[index];
        System.out.println(name + " said " + said);
    }
}


public class chandra_game {
    public static void main(String[] args) {
        RockPaperScissor game = new RockPaperScissor();
        game.startGame();
    }
}