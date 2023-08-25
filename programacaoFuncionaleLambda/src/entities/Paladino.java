package entities;

public class Paladino extends Player{

    @Override
    public boolean attack(Player opponent) {
        int deltaX = Math.abs(super.getX() - opponent.getX());
        int deltaY = Math.abs(super.getY() - opponent.getY());

        if (verifyAttack(deltaX, deltaY)) {
            opponent.setLife(opponent.getLife() - 20);
            return true;
        } 

        return false;
    }

}
