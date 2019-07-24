package nine;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import six.SimpleAdvice;

public class RegexPointcutDemo {
    public static void main(String... args){
        Guitarist johnMayer = new Guitarist();
        JdkRegexpMethodPointcut pc = new JdkRegexpMethodPointcut();
        pc.setPattern(".*Sing.*");
        Advisor advisor = new DefaultPointcutAdvisor(pc,new SimpleAdvice());
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnMayer);
        pf.addAdvisor(advisor);
        Guitarist proxy = (Guitarist)pf.getProxy();
        proxy.Sing();
        proxy.Sing2();
        proxy.rest();
    }
}
