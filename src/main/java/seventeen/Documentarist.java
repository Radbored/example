package seventeen;

public class Documentarist {
    private GrammyGuitarist guitarist;
    public void execute(){
        guitarist.Sing();
        guitarist.talk();
    }
    public void setDep(GrammyGuitarist guitarist){
        this.guitarist=guitarist;
    }
}
