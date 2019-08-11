package cuc.dawei.servicefeign.clients;

import cuc.dawei.servicefeign.clients.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName SchedualServiceHi
 * @Description TODO
 * @Author Mike
 * @Date 2019/8/10 0:14
 * @Version 1.0
 */

//通过@ FeignClient（“服务名”），来指定调用哪个服务
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}