
public class java19 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++)
            {
                for (int j = 0; j <= 4-i; j++)
                    System.out.print(String.valueOf(Character.toChars(j + 65)) + ' ');
                System.out.println();
            }
    }

}
/*
A B C D E 
A B C D 
A B C 
A B 
A 
*/