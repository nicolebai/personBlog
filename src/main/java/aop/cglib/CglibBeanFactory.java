package aop.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibBeanFactory {

	public static CglibBean getProxyInstance(CglibProxy cglibproxy){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CglibBean.class);
		enhancer.setCallback(cglibproxy);
		return (CglibBean) enhancer.create();
		
	}
}
