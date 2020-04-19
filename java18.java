
public class java18 {

    public static void main(String[] args) {
        for(int i = 0; i <= 4; i++)
        {
            for( int j = 1; j <= 5 - i; j ++)
            {  
                System.out.print(String.valueOf(Character.toChars(i + 65)) + ' ' ) ;
              }
            System.out.println();
        }
    }
}


/*
A A A A A 
B B B B 
C C C 
D D 
E 

*/