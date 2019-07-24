package six;

import five.Pointcut;
import four.SimpleThrowsAdvice;
import org.aopalliance.aop.Advice;
import two.Singer;

public class StaticPointcutDemo {
    public static void main(String... args){
        GoodGuitarist johnMayer = new GoodGuitarist();
        GreatGuitarist ericClapton = new GreatGuitarist();
        Singer proxyOne;
        System proxyTwo;
        Pointcut pc= (Pointcut) new SimpleStaticPointcut();
    }
}
