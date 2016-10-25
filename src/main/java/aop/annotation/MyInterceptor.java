package aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切面类
 * @author baiyani
 *
 */
@Aspect
public class MyInterceptor {

	@Pointcut("execution(* aop.annotation.PersonService.*(..))")
	private void anyMethod(){};//定义一个切入点
	
	@Before("anyMethod()")
	public void doBefore(){
		System.out.println("前置通知");
		
	}
	
	@AfterReturning("anyMethod()")
	public void doAfterReturning(){
		System.out.println("后置通知");
		
	}
	
	
	
	@After("anyMethod()")
	public void doAfter(){
		System.out.println("最终通知");
		
	}
	@AfterThrowing("anyMethod()")
	public void doAfterThrowing(){
		System.out.println("例外通知");
		
	}
	
	@Around("anyMethod()")
	public Object doBasicProfiling(ProceedingJoinPoint joinpoint) throws Throwable{
		System.out.println("进入环绕通知");
		Object object = joinpoint.proceed();
		System.out.println("退出该方法");
		return object;
	}
	
	
	
}
