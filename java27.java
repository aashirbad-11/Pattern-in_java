public class java27 {
    
    public static void main(String[] args) {
        for(char i = 'A'; i <= 'E'; i++)
        {
            for(char j = 'E'; j >= 'A'; j--)
            {
                if (i >= j)
                {
                    System.out.print(Character.toString(i) + ' ');
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

        A 
      B B 
    C C C 
  D D D D 
E E E E E

*/