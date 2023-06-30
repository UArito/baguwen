package generator.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentHashMap;

public class Demo01 {
    /**
     * ThreadLocal
      ConcurrentHashMap
      **/
    public void test01(){
        ThreadLocal<String> n1 = new ThreadLocal<>();
        n1.remove();
        ConcurrentHashMap<String,String> cn = new ConcurrentHashMap<>();
    }

    /**
     * @Autowired   @Resource
     **/
    @Autowired(required = true)
    private String test01 = "";
    @Resource
    private String test02 = "";


    /**
     * @compontent
     * controller
     * bean
     * respro
     *
     * **/
}
