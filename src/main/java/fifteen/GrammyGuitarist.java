package fifteen;

import eight.Guitar;
import two.Singer;

public class GrammyGuitarist implements Singer {
    @Override public void Sing(){
        System.out.println("sing:Gravity is working against me \n Andgravity wants to bring me down");
    }
    public void Sing(Guitar guitar){
        System.out.println("play:" +guitar.play());
    }
    public void rest(){
        System.out.println("zzz");
    }
    public void talk(){
        System.out.println("talk");
    }
}
