package eleven;


import eight.Guitar;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import six.SimpleAdvice;

public class AnnotationPointcutDemo {
    public static void main(String... args){
        Guitarist johnMayer = new Guitarist();
        AnnotationMatchingPointcut pc = new AnnotationMatchingPointcut(AdviceRequired.class);
        Advisor advisor = new DefaultPointcutAdvisor(pc,new SimpleAdvice());
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnMayer);
        pf.addAdvisor(advisor);
        Guitarist proxy = (Guitarist)pf.getProxy();
        proxy.Sing(new Guitar());
        proxy.rest();
    }
}
