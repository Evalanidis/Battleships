import java.util.Scanner;

public class BattleshipPosition {

    private Scanner input = new Scanner(System.in);
    private int x,y;
    public Terrain bTerrain = new Terrain();


    public void strategicPosition(){

        for(int i = 1; i<=6; i++){
            while(true) {
                System.out.print("Insert the x coordinate for battleship " + i + ": ");
                x = input.nextInt();
                System.out.print("Insert the y coordinate for battleship " + i + ": ");
                y = input.nextInt();
                if (((x >= 1 & x <= 10) & (y >= 1 & y <= 10)) && bTerrain.freeSpace(x-1,y-1)){
                    bTerrain.terrainPreparation(x-1,y-1);
                    break;
                }
                else{
                    System.out.println("Wrong coordinates! x,y -> [1,10]");
                }
            }
        }
    }
}
