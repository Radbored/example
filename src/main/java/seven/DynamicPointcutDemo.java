package seven;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.DeclareParentsAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import six.SimpleAdvice;

public class DynamicPointcutDemo {
    public static void main(String... args){
        SampleBean target = new SampleBean();
        //Advisor advisor = new DeclareParentsAdvisor(new SimpleDynamicPointcut(),new SimpleAdvice());
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
       // pf.addAdvisor(advisor);
        SampleBean proxy = (SampleBean)pf.getProxy();
        proxy.foo(1);
        proxy.foo(10);
        proxy.foo(100);
        proxy.bar();
        proxy.bar();
        proxy.bar();
    }
}
