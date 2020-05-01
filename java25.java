public class java25 {
    public static void main(final String[] args) {
        for(int i = 1; i<= 5; i++)
        {
            for(int j = 5; j >= 1; j--)
            {
                if(i >= j)
                {
                    System.out.print(Integer.toString(i) + ' ');

                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*

        1 
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5 

*/