package aop.cglib;

public class CglibBean {

	public void sayHello(){
		System.out.println("say hello world!");
	}
	
	public static void main(String[] args) {
		try {
			CglibBean cglibdemo = CglibBeanFactory.getProxyInstance(new CglibProxy());
			cglibdemo.sayHello();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
