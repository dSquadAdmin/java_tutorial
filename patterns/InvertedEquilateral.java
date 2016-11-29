package patterns;

/**
 * Created by ksv on 11/13/16.
 */
public class InvertedEquilateral {
    public void showInvertedTriangle(){
        {
            int i, j, k;
            for(i=5;i>=1;i--)
            {
                for(j=5;j>i;j--)
                {
                    System.out.print(" ");
                }
                for(k=1;k<(i*2);k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
