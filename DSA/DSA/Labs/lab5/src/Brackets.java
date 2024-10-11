public class Brackets {
    public static char first_single_letter(final char text[],final int n)

    {
        for(int i =0 ; i<n ; i++)
        {
            boolean unique = true;
            for(int j = 0 ;j<n;j++)
            {
                if((i != j) && (text[i] == text[j]))
                {
                    unique = false;
                    break;
                }
            }
            if(unique){
                return text[i];
            }
        }
        return '\0';


    }

    public static void main(String[] args) {
        Brackets bb = new Brackets();
        char letters [] = {'a','l','g','o','r','t','h','i','m'};
        bb.first_single_letter(letters,8);
    }
}
