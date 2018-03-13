/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Princess Dimzon
 */
public class MatrixTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Note: Hindi naka function para lang mabilis makita.
         *Iimplement sa mismong code as functions
         */

        int row = 6;
        int col = 7;
        
        //sample matrix
        int Matrix[][] = {{1, 2, 3, 4, 5, 6, 7},
                          {7, 6, 5, 4, 3, 2, 8},
                          {7, 6, 5, 4, 3, 2, 8},
                          {7, 6, 5, 4, 3, 2, 8},
                          {7, 6, 5, 4, 3, 2, 8},
                          {7, 6, 5, 4, 3, 2, 8}};
        
        
//        int[][] Matrix =  new int[row][col];
        
        System.out.println("THIS IS THE MATRIX:");
        for (int x = 0; x < row; x++) {
            for (int y = 0; y <col; y++) {
                System.out.print(Matrix[x][y]);

            }
			System.out.println("");
        }

        
        int[][] Temp = new int[6][1];
        
        /*
            SHIFT RIGHT IMPLEMENTATION
         */
        int temp[][]=new int[row][col];

        System.out.println("SHIFT LEFT");
		int t=0;
//SHIFT RIGHT
        //kinukuha last ng column matrix and stores it in a temp matrix
        for (int tempX = 0; tempX<col; tempX++) {
            for (int tempY = 0; tempY <row; tempY++) {
				temp[tempY][tempX] = Matrix[tempY][(tempX + 1) % Matrix[tempY].length];

            }
		}
		for (int i = 0; i < temp.length; i++) {
			System.arraycopy(temp[i], 0, Matrix[i], 0, temp[i].length);
		}
		
		
   		for (int x = 0; x < row; x++) {
            for (int y = 0; y <col; y++) {
                System.out.print(Matrix[x][y]);

            }
			System.out.println("");
        }
		
		System.out.println("SHIFT RIGHT");
		int wew[][]	=new int[row][col];
//SHIFT RIGHT
        //kinukuha last ng column matrix and stores it in a temp matrix
        for (int tempX = col-1; tempX>0; tempX--) {
            for (int tempY = row-1; tempY >=0; tempY--) {
				if(tempX+1!=col){
					wew[tempY][tempX] = Matrix[tempY][tempX-1];
					
				}
				else{
					wew[tempY][tempX] = Matrix[tempY][5];
					wew[tempY][0] = Matrix[tempY][6];
					
				}
            }
		}
		for (int i = 0; i < wew.length; i++) {
			System.arraycopy(wew[i], 0, Matrix[i], 0, wew[i].length);
		}
		
		
   		for (int x = 0; x < row; x++) {
            for (int y = 0; y <col; y++) {
                System.out.print(Matrix[x][y]);

            }
			System.out.println("");
        }
        //x dapat nag ddecrement from highest val ng col
        //moves all the discs (in this case, int lang) from column(5) 
        //to column(5-1) hanggang column(0) to column(1)
        for (int x = (row)-1; x >= 0; x--) {
            for (int y = 0; y < col; y++) {
                Matrix[x][y] = Matrix[y][x];
            }
						System.out.println("");
        }
        //temp values stored in the temp matrix are set to the first column (column(0))
        //of the original matrix
        for (int tempX = 0; tempX < 1; tempX++) {
            for (int tempY = 0; tempY < 6; tempY++) {
                Matrix[tempY][tempX] = Temp[tempY][tempX];
            }
						System.out.println("");
        }
        //only prints the matrix
        System.out.println("");
         for (int x = 0; x < row; x++) {
            for (int y = 0; y <col; y++) {
                System.out.print(Matrix[x][y]);

            }
			System.out.println("");
        }
        
        System.out.println("");
       
        
        System.out.println("SHIFT LEFT");
        /*
            SHIFT LEFT IMPLEMENTATION
        */
        //kinukuha first column ng matrix and stores it in a temp matrix
        for (int tempX = 0; tempX < 1; tempX++) {
            for (int tempY = 0; tempY < 6; tempY++) {
                Temp[tempY][tempX] = Matrix[tempY][tempX];
                System.out.print(Temp[tempY][tempX]);
            }
						System.out.println("");
        }
        //moves all the discs (in this case, int lang) from col(1) 
        //to column(0) hanggang column(6) to column(5)
        for (int x = 0; x < (col - 1); x++) {
            for (int y = 0; y < row; y++) {
               Matrix[y][x] = Matrix[y][x+1];
            }
						System.out.println("");
        }
        //temp values stored in the temp matrix are set to the last column
        //of the original matrix        
        int column = col - 1;
        for (int tempX = 0; tempX < 1; tempX++) {
            for (int tempY = 0; tempY < 6; tempY++) {
                Matrix[tempY][column] = Temp[tempY][tempX];
                System.out.println(Matrix[tempY][tempX]);
            }
						System.out.println("");
        }
        //only prints the matrix
        System.out.println("");
        for (int x = 0; x < col; x++) {
            for (int y = 0; y < row; y++) {
                System.out.print(Matrix[y][x]);
                System.out.print("");
            }
						System.out.println("");
        }
        
        
    }

}
