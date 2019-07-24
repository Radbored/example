package ten;

import nine.Guitarist;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import six.SimpleAdvice;

 class AspectjexpPointcutDemo {
    public static void main(String... args){
        Guitarist johnMayer = new Guitarist();
        AspectJExpressionPointcut pc = new AspectJExpressionPointcut();
        pc.setExpression("execution(* sing*(..))");
        Advisor advisor = new DefaultPointcutAdvisor(pc,new SimpleAdvice());
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnMayer);
        pf.addAdvisor(advisor);
        Guitarist proxy =(Guitarist)pf.getProxy();
        proxy.Sing();
        proxy.Sing2();
        proxy.rest();
    }
}
