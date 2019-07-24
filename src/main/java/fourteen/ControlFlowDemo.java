package fourteen;

import five.Pointcut;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class ControlFlowDemo {
    public static void main(String... args){
        ControlFlowDemo ex = new ControlFlowDemo();
        ex.run();
    }
    public void run(){
        TestBean target = new TestBean();
        Pointcut pc = (Pointcut) new ControlFlowPointcut(ControlFlowDemo.class,"test");
        Advisor advisor = new DefaultPointcutAdvisor((org.springframework.aop.Pointcut) pc,new SimpleBeforeAdvice());
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        TestBean proxy = (TestBean)pf.getProxy();
        System.out.println("\tTryling normal invoke");
        proxy.foo();
        System.out.println("\n\tTrying under ControlFlowDemo.rest()");
        test(proxy);
    }
    private void test(TestBean bean){
        bean.foo();
    }
}
