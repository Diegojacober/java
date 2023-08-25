package entities;

public class Witcher extends Player {


    @Override
    public boolean attack(Player opponent) {
        int deltaX = Math.abs(super.getX() - opponent.getX());
        int delyaY = Math.abs(super.getY() - opponent.getY());

        if (verifyAttack(deltaX, delyaY)) {
            opponent.setLife(opponent.getLife() - 50);
            return true;
        } 

        return false;
    }

}
