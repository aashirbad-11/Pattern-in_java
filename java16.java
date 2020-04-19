
public class java16 {

    public static void main(String[] args) {
        for(int i = 0; i <= 4; i++)
        {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(Integer.toString(i +1) + ' ');
            
            System.out.println();
        }
    }
}


// 1 1 1 1 1 
// 2 2 2 2 
// 3 3 3 
// 4 4 
// 5 