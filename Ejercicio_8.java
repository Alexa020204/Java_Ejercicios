
public class Ejercicio_8 {
    public static void main(String[] args) {
        String[][] arr = new String[9][9];
        
        for (int i = 0 ; i<9; i++){
            for (int j = 0 ; j<9; j++){
                if (i==4 || j == 4){
                    arr[i][j]="o";
                }
                else{
                    arr[i][j]="-";
                }
                
            }
            
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }

    
}
