package two;

public class Guitarist implements Singer {
    private String lyric="Youre gonna live forever in me";


    @Override
    public void Sing() {
        System.out.println(lyric);
    }
}
