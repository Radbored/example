package seventeen;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ProxyFactoryBeanDemo {
    public static void main(String... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("seventeen/app-context-xml.xml");
        ctx.refresh();
        Documentarist documentaristOne =ctx.getBean("documentaristOne",Documentarist.class);
        Documentarist documentaristTwo = ctx.getBean("documentaristTwo",Documentarist.class);
        System.out.println("documentarist One>>");
        documentaristOne.execute();
        System.out.println("documentarist Two>>");
        documentaristTwo.execute();
    }
}
