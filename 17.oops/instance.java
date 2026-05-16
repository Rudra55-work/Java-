public class instance {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();

}
class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen moves in all directions");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Rook moves in straight lines");
    }
}

class king implements ChessPlayer {
    public void moves() {
        System.out.println("King moves one square in any direction");
    }
}
    

