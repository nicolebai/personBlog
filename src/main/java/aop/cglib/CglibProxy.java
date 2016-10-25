package aop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer =  new Enhancer();
	public Object getProxy(Class clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback((Callback) this);
		return enhancer.create();
		
	}
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("前置条件---");
		arg3.invokeSuper(arg0, arg2);
		System.out.println("后置条件---");
		return null;
	}

}
