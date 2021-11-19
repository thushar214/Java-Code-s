import java.util.*;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int K=sc.nextInt();
        int B=sc.nextInt();
        int N=sc.nextInt();
        int[] S = new int[10];
        int[] W=new int[10];
        int count=0;
        for(int j=0;j<N;j++)
        {
            W[j]=sc.nextInt();
        }
        int M=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            S[i]=sc.nextInt();
        }
        
        //Logic
        for(int a=0;a<N;a++)
        {
            if(S[a]!=W[a] && K>=S[a])
            {
                for(int b=0;W[a]==S[a];b++)
                {
                    S[a]=S[a]+B;
                    K=K-B;
                }
                System.out.println(K);
                if(S[a]==W[a])
                {
                    count++;
                }
                
                //System.out.println("Increment value:"+W[a]);
            }
            else
            {
                count++; 
            }
            
        }
        System.out.println("NO of work's Done:"+count);
    }
}
