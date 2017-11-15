/*
* @author Valanidis Efstathios
* @literal evalanidis@gmail.com
* @since 15/11/2017
* */
public class Main {

    public static void main(String[] args){

        Terrain battleGround = new Terrain();
        BattleshipPosition ships = new BattleshipPosition();
        battleGround.Terrain();
        System.out.println("---------------------------------------------------");
        ships.strategicPosition();
        battleGround.printTerrain();
        System.out.println("---------------------------------------------------");


    }
}
