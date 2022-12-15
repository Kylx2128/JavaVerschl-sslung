public class Alphabet {
    protected String alphabeString = "abcdefghijklmnopqrstuvwxyz";
    protected String alphabeStringInCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    protected char alphabetArray[] = alphabeString.toCharArray();
    protected char alphabetArrayinCaps[] = alphabeStringInCaps.toCharArray();

    protected int getPos(char x){

        for(int i = 0;i<26;i++){
            if(x == alphabetArray[i]||x == alphabetArrayinCaps[i]){
                return i;
            }

        }

        return -1;
    }
}
