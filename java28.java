public class java28 {

    public static void main(String[] args) {
        for(char i ='A'; i <= 'E'; i++)
        {
            for(char j = 'E'; j >= 'A'; j--)
            {
                if( i >= j)
                    System.out.print(Character.toString(j) + ' ');
                else
                    System.out.print("  ");
            }
        System.out.println();

        }
        
    }
    
}

/* 
        A 
      B A 
    C B A 
  D C B A 
E D C B A 

*/