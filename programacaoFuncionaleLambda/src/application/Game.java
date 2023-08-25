package application;

import entities.Paladino;
import entities.Player;
import entities.Witcher;

public class Game {
    public static void main(String[] args) {
        
        Player witcher = new Witcher();
        Player paladino = new Paladino();

        witcher.setX(10);
        witcher.setY(10);

        paladino.setX(10);
        paladino.setY(11);


        paladino.attack(witcher);

        System.out.println(witcher);
        System.out.println(paladino);
    }
}
