public class MonoVerschluesslung implements Runnable{

    final String wort;

    public MonoVerschluesslung(String wort){
        this.wort = wort;
    }

    @Override
    public void run(){
        String value;
        value = verschluesseln(wort);
        System.out.println(value);
        value = entschluesseln(value);
        System.out.println(value);

    }

    protected String verschluesseln(String wort){
        char[] wortArray = wort.toLowerCase().toCharArray();
        for(int i = 0;i<wortArray.length;i++){
            switch(wortArray[i]){
                case 'a'|'A': wortArray[i] = 'p'; break;
                case 'b'|'B': wortArray[i] = 'o'; break;
                case 'c'|'C': wortArray[i] = 'i'; break;
                case 'd'|'D': wortArray[i] = 'u'; break;
                case 'e'|'E': wortArray[i] = 'z'; break;
                case 'f'|'F': wortArray[i] = 't'; break;
                case 'g'|'G': wortArray[i] = 'r'; break;
                case 'h'|'H': wortArray[i] = 'e'; break;
                case 'i'|'I': wortArray[i] = 'w'; break;
                case 'j'|'J': wortArray[i] = 'q'; break;
                case 'k'|'K': wortArray[i] = 'a'; break;
                case 'l'|'L': wortArray[i] = 's'; break;
                case 'm'|'M': wortArray[i] = 'd'; break;
                case 'n'|'N': wortArray[i] = 'f'; break;
                case 'o'|'O': wortArray[i] = 'g'; break;
                case 'p'|'P': wortArray[i] = 'h'; break;
                case 'q'|'Q': wortArray[i] = 'j'; break;
                case 'r'|'R': wortArray[i] = 'k'; break;
                case 's'|'S': wortArray[i] = 'l'; break;
                case 't'|'T': wortArray[i] = 'y'; break;
                case 'u'|'U': wortArray[i] = 'x'; break;
                case 'v'|'V': wortArray[i] = 'c'; break;
                case 'w'|'W': wortArray[i] = 'v'; break;
                case 'x'|'X': wortArray[i] = 'b'; break;
                case 'y'|'Y': wortArray[i] = 'n'; break;
                case 'z'|'Z': wortArray[i] = 'm'; break;
                default: break;
            }

        }
        return String.valueOf(wortArray);

    }

    protected String entschluesseln(String wort){
        char[] wortArray = wort.toLowerCase().toCharArray();
        
        for(int i = 0;i<wortArray.length;i++){
            switch(wortArray[i]){
                case 'a'|'A': wortArray[i] = 'k'; break;
                case 'b'|'B': wortArray[i] = 'x'; break;
                case 'c'|'C': wortArray[i] = 'v'; break;
                case 'd'|'D': wortArray[i] = 'd'; break;
                case 'e'|'E': wortArray[i] = 'h'; break;
                case 'f'|'F': wortArray[i] = 'n'; break;
                case 'g'|'G': wortArray[i] = 'o'; break;
                case 'h'|'H': wortArray[i] = 'p'; break;
                case 'i'|'I': wortArray[i] = 'c'; break;
                case 'j'|'J': wortArray[i] = 'q'; break;
                case 'k'|'K': wortArray[i] = 'r'; break;
                case 'l'|'L': wortArray[i] = 's'; break;
                case 'm'|'M': wortArray[i] = 'z'; break;
                case 'n'|'N': wortArray[i] = 'y'; break;
                case 'o'|'O': wortArray[i] = 'b'; break;
                case 'p'|'P': wortArray[i] = 'a'; break;
                case 'q'|'Q': wortArray[i] = 'j'; break;
                case 'r'|'R': wortArray[i] = 'g'; break;
                case 's'|'S': wortArray[i] = 'l'; break;
                case 't'|'T': wortArray[i] = 'f'; break;
                case 'u'|'U': wortArray[i] = 'd'; break;
                case 'v'|'V': wortArray[i] = 'w'; break;
                case 'w'|'W': wortArray[i] = 'i'; break;
                case 'x'|'X': wortArray[i] = 'u'; break;
                case 'y'|'Y': wortArray[i] = 't'; break;
                case 'z'|'Z': wortArray[i] = 'e'; break;
                default: break;
            }

        }


        return String.valueOf(wortArray);
    }


}