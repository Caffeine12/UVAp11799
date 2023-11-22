import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int iteration = scanner.nextInt();
        String input;
        int max=0;

        for(int i=0;i<=iteration;i++)
        {
            input=scanner.nextLine();
            if(i!=0)
            {
                String[] inputarr= input.split("\\s");
                
                for(int j=1;j<=Integer.parseInt(inputarr[0]);j++)
                {
                    if(Integer.parseInt(inputarr[j])>max)
                    {
                        max=Integer.parseInt(inputarr[j]);
                    }                   

                }
                System.out.println("Case "+i+": "+max);
                max=0;
            }

        }        
    }
}
