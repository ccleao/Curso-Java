package oo.composicao.Heranca.Desafio.teste;

import oo.composicao.Heranca.Direcao;
import oo.composicao.Heranca.Hero;
import oo.composicao.Heranca.Monster;

public class Jogo {
    public static void main(String[] args) {

        Monster monster = new Monster(10,10);
        monster.x = 10;
        monster.y = 10;

        Hero hero = new Hero(10, 11);

        System.out.println("Monster tem => " + monster.vida);
        System.out.println("Hero tem => " + hero.vida);

        monster.atacar(hero);
        hero.atacar(monster);
        monster.atacar(hero);
        hero.atacar(monster);

        monster.andar(Direcao.NORTE);
        monster.atacar(hero);
        hero.atacar(monster);

        System.out.println("Monster tem => " + monster.vida);
        System.out.println("Hero tem => " + hero.vida);


    }
}
