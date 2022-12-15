
public class Verschluesslung extends Alphabet {

    private final int key;

    Verschluesslung(int key){
        this.key = key;
    }

    protected String verschluesseln(String KTAWert){
        char[] KTAWertC = KTAWert.toCharArray();
        int i;
        int count = 0;
        for(char x : KTAWertC){
            i = getPos(x);
            //System.out.println(i+" i1");
            if(i!=-1){
                i = (i + key)%26;
                //System.out.println(i+" i2");
                KTAWertC[count] = alphabetArray[i];
                //System.out.println("Changed value "+ x);
            }
            count++;
        }
        String v = String.valueOf(KTAWertC);
        return v;
    }

    protected String entschluesseln(String KTAWert){
        char[] KTAWertC = KTAWert.toCharArray();
        int i;
        int count = 0;
        for(char x : KTAWertC){
            i = getPos(x);
            if(i!=-1){
                i = (i - key + 26)%26;
                KTAWertC[count] = alphabetArray[i];
            }
            count++;
        }
        String v = String.valueOf(KTAWertC);
        return v;
    
    }




}
