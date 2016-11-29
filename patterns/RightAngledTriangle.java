package patterns;

/**
 * Created by ksv on 11/13/16.
 */
public class RightAngledTriangle {
    public void showTriangle(){
            int i,j;
            for(i=1; i<=6; i++)
            {
                for(j=1; j<i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
