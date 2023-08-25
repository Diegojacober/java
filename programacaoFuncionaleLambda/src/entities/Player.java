package entities;

public class Player {
    private int x;
    private int y;
    private int life = 100;

    public Player() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    
    public boolean walk(Direction direction) {
        switch (direction) {
            case NORTE: y++;
            case SUL: y--;
            case LESTE: x++;
            case OESTE: x--;
        }

        return true;
    }

    protected boolean verifyAttack(int x, int y) {
        if (x == 0 && y == 1) {
            return true;
        } else if (x == 1 && y == 0) {
            return true;
        } 

        return false;
    }


    public boolean attack(Player opponent) {
        int deltaX = Math.abs(x - opponent.getX());
        int delyaY = Math.abs(y - opponent.getY());

        if (verifyAttack(deltaX, delyaY)) {
            opponent.setLife(opponent.getLife() - 10);
            return true;
        } 

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName() + " está na posição X: " + x + ", " + "Y: " + y + "\n");
        sb.append("Vida: " + life);
        return sb.toString();
    }

    
}
