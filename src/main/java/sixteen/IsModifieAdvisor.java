package sixteen;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class IsModifieAdvisor extends DefaultIntroductionAdvisor {
    public IsModifieAdvisor(){
        super(new IsModifiedMixin());
    }
}
