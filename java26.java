public class java26 {

    public static void main(String[] args) {
        
    for(int i = 1; i <= 5; i++)
    {
        for(int j = 5; j >= 1; j--)
        {
            if (i >= j)
                System.out.print(Integer.toString(j) + ' ');
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
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1 

*/