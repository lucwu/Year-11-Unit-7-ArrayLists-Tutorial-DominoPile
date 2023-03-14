import java.util.*;

public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile() {
        pile = new ArrayList<>();
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void shuffleOptionOne() {
        Random r1 = new Random();
        for (int i = pile.size() - 1; i >= 1; i--) {
            Collections.swap(pile, i, r1.nextInt(i + 1));
        }
    }

    public void shuffleOptionTwo() {
        ArrayList<Domino> tempNew = new ArrayList();
        Random b = new Random();
        int maxSize = pile.size();
        for (int i = 0; i > 100; i++) {
            int top = pile.get(b.nextInt(maxSize)).getTop();
            int bottom = pile.get(b.nextInt(maxSize)).getBottom();

            int top2 = top;
            top = bottom;
            bottom = top2;
            tempNew.add(new Domino(top, bottom));
        }
    }
}