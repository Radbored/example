package twelve;

import eight.GrammyGuitarist;
import eight.Guitar;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import six.SimpleAdvice;

public class NamePointcutUsingAdvisor {
    public static void main(String... args){
        GrammyGuitarist johnMayer = new GrammyGuitarist();
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor(new SimpleAdvice());
        advisor.setMappedNames("sing");
        advisor.setMappedNames("rest");
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnMayer);
        pf.addAdvisor(advisor);
        GrammyGuitarist proxy = (GrammyGuitarist)pf.getProxy();
        proxy.Sing();
        proxy.Sing(new Guitar());
        proxy.rest();
        proxy.talk();

    }
}
