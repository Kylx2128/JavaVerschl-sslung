

class Main{

    static public void main(String[] args){
        String wort = "Hallo ich heiﬂe z";

        System.out.println("Caesar:"+ "\n");
        caesar(wort);
        System.out.println("\n");

        System.out.println("Mono:"+ "\n");
        mono(wort);
        System.out.println("\n");

        System.out.println("Vigenere"+"\n");
        vigenere(wort);

    }

    static private void caesar(String wort){
        Verschluesslung verschluesslung = new Verschluesslung(2);
        String verschluesselt = verschluesslung.verschluesseln(wort);
        System.out.println(verschluesselt);
        String entschluesselt = verschluesslung.entschluesseln(verschluesselt);
        System.out.println(entschluesselt);
    }

    static private void mono(String wort){
        MonoVerschluesslung mon = new MonoVerschluesslung(wort);
        Thread mono = new Thread(mon);
        mono.run();
    }

    static private void vigenere(String wort){
        Vigenere vig = new Vigenere("ROM");
        System.out.println(vig.decode(wort));
    }
}    