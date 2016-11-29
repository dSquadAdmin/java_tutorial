package patterns;

/**
 * Created by ksv on 11/13/16.
 */
public class EquilateralTriangle {
   public void showEquilateralTriangle(){
        {
            int i,j,k;
            for(i=1; i<=5; i++)
            {
                for(j=4; j>=i; j--)
                {
                    System.out.print(" ");
                }
                for(k=1; k<=(2*i-1); k++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
