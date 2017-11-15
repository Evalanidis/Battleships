/*
* @author Valanidis Efstathios
* @literal evalanidis@gmail.com
* @since 15/11/2017
* */

public class Terrain {

    public static char [][] battleTerrain =new char [10][10];

    public void Terrain(){
        createTerrain();
        printTerrain();

    }


    public void createTerrain(){
        for(int i = 0; i<10;i++)
            for (int j =0; j<10;j++)
                battleTerrain[i][j] = '.';
    }

    public void terrainPreparation(int i, int j){
        battleTerrain[i][j] = '@';
    }

    public boolean freeSpace(int i,int j){
        return battleTerrain[i][j]=='.';
    }

    public void printTerrain(){
        for(int x = 0 ; x<10; x++) {
            if (x == 0)
                System.out.print("\t" + (x + 1) +"  ");
            else
                System.out.print((x + 1)+ "  ");
        }
        System.out.println();
        for(int i = 0; i<10;i++){
            System.out.print(i+1+ "\t");
            for (int j =0; j<10;j++){
                System.out.print(battleTerrain[i][j] +"  ");
            }
            System.out.println();
        }
    }

}
