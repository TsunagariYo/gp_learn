package com.edu.delegatepattern.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Leader
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 17:43
 */
public class Leader {
    //预先知道员工的特长,分发任务
    private Map<String,Iemployee> register = new HashMap<String, Iemployee>();
    public Leader() {
        register.put("加密",new EmployeeA());
        register.put("算法",new EmployeeB());
    }

    public void doing(String command){
    register.get(command).doing(command);
    }
}
