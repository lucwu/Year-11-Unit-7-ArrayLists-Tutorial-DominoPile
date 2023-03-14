public class Domino {
    private int top;
    private int bottom;

    public Domino() {
        top = 0;
        bottom = 0;

    }

    public Domino(int userTop, int userBottom) {
        top = userTop;
        bottom = userBottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void flip() {
        int top2 = bottom;
        bottom = top;
        top = top2;
    }

    public void settle() {
        if (bottom < top) {
            flip();
        }
    }

    public int compareTo(Domino other) {
        settle();
        other.settle();
        if (bottom < other.getBottom()) {
            return -1;
        } else if (top > other.getTop()) {
            return 1;
        } else if (top == other.getBottom() || bottom == other.getTop()) {
            if (bottom > other.getBottom()) {
                return 1;
            } else if (bottom < other.bottom) {
                return -1;

            } else if (bottom == other.getBottom()) {
                return 0;
            }
        }
        return 0;
    }

    public int compareToWeight(Domino other) {
        int thisTotalNum = top + bottom;
        int otherTotalNum = other.top + other.bottom;
        if (thisTotalNum < otherTotalNum) {
            return -1;
        } else if (thisTotalNum > otherTotalNum) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean canConnect(Domino other) {
        if (this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom) {
            return true;
        } else {
            return false;
        }
    }

}