package nine;

import two.Singer;

public class Guitarist implements Singer {

    @Override public void Sing(){
        System.out.println("Just keep me where the light is");
    }
    public void Sing2(){
        System.out.println("Oh gravity? stay the hell away from me");
    }
    public void rest(){
        System.out.println("zzz");
    }
}
