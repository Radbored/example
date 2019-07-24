package eleven;

import eight.Guitar;
import two.Singer;

public class Guitarist implements Singer {
    @Override public void Sing(){
        System.out.println("Dream of ways to throw it all away");
    }
    @AdviceRequired
    public void Sing(Guitar guitar){
        System.out.println("play: "+guitar.play());
    }
    public void rest(){
        System.out.println("zzz");
    }
}
