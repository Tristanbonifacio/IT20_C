

package multidimensionalarray;


public class multidimensionalarray {
     public static void main(String[] args) {
         
         //2D Array of Program and Year
         String[][] programAndyear ={
             {"BSIT", "First year"},
             {"HM", "Second year"},   
             {"COMPUTER SCIENCE", "Third year"}
         };
         //Process using For Loops
         for(int i = 0; i < programAndyear.length; i++) {
             for(int j = 0; j < programAndyear[i].length; j++ ) {
                 System.out.print(programAndyear[i][j] + " ");
             }
             //Output
             System.out.println();
         }
     }
}