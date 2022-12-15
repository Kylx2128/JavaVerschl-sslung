public class Vigenere extends Alphabet {

    private final String decode;
    private final int[] key;

    Vigenere(String decode) {

        this.decode = decode;
        this.key = produceKey(decode.toCharArray());
    }

    protected String decode(String word){
        char[] wordC = word.toCharArray();

        int length = 0;
        for(int i = 0;i<wordC.length;i++){

            if(getPos(wordC[i])!=-1) {
                int pos = (getPos(wordC[i]) + key[length]) % 26;
                wordC[i] = alphabetArray[pos];
            }

            if(length<key.length-1) {
                length++;
            }
            else length = 0;
        }

        return String.valueOf(wordC);
    }

    private int[] produceKey(char[] chars){
        int[] key = new int[chars.length];
        int i = 0;
        for(char c : chars){
            key[i] = getPos(c);
            i++;
        }
        return key;
    }

}
