package addition.of.matrices;

/**
 *
 * @author Dheeraj
 */
public class additionofmatrices{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
//creating two matrices    
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
      
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
    int sum = a[i][j]+b[i][j];  
     c[i][j]= sum;
    
}//end of k loop  
System.out.print(c[i][j]+" ");  //printing matrix element  
}//end of j loop  
System.out.println();//new line    
}    
}}  
