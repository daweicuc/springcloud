package cuc.dawei.servicefeign.clients.fallback;

import cuc.dawei.servicefeign.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystric
 * @Description TODO
 * @Author Mike
 * @Date 2019/8/10 0:14
 * @Version 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail,"+name;
    }
}