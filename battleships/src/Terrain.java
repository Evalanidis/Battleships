/*
* @author Valanidis Efstathios
* @literal evalanidis@gmail.com
* @since 15/11/2017
* */

public class Terrain {

    public static char [][] battleTerrainPlayer =new char [10][10];
    public static char [][] battleTerrainPC =new char [10][10];

    public void Terrain(){
        createTerrain(battleTerrainPlayer);
        createTerrain(battleTerrainPC);
        printTerrain(battleTerrainPlayer);
        createTerrain(battleTerrainPC);

    }


    public void createTerrain(char[][] battleTerrain){
        for(int i = 0; i<10;i++)
            for (int j =0; j<10;j++)
                battleTerrain[i][j] = '.';
    }

    public void terrainPreparation(int i, int j){
        battleTerrainPlayer[i][j] = '1';
    }

    public boolean freeSpace(int i,int j){
        return battleTerrainPlayer[i][j]=='.';
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
                System.out.print(battleTerrainPlayer[i][j] +"  ");
            }
            System.out.println();
        }
    }

    public void printTerrain(char [][] currentTerrain){
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
                System.out.print(currentTerrain[i][j] +"  ");
            }
            System.out.println();
        }
    }

}

