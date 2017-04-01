package lt20170330;
import java.util.Random;  

public class ThreadTest {  
      
    private static Random dandom=new Random();  
    private static ThreadLocal<MyThreadScopeData> MyThreadScopeData=new ThreadLocal<MyThreadScopeData>();  
  
    public static void main(String[] args) {  
        for(int i=0;i<2;i++){  
            new Thread(new Runnable(){  
                public void run() {  
                    int data=dandom.nextInt(100);  
                    System.out.println(Thread.currentThread().getName()  
                            +"放入数据:"+data);  
                    MyThreadScopeData ScopeData=new MyThreadScopeData();  
                    ScopeData.setName("name : "+data + " ");  
                    ScopeData.setAge( data);  
                    MyThreadScopeData.set(ScopeData);  
                    new A().get();  
                    new B().get();  
                }  
                  
            }).start();  
        }  
    }  
      
    static class A{  
        public void get(){  
            System.out.println("A 从"+Thread.currentThread().getName()  
                    +"中取的数据:"+MyThreadScopeData.get().getName()  
                    +MyThreadScopeData.get().getAge());  
        }  
    }  
      
    static class B{  
        public void get(){  
            System.out.println("B 从"+Thread.currentThread().getName()  
                    +"中取的数据:"+MyThreadScopeData.get().getName()  
                    +MyThreadScopeData.get().getAge());  
        }  
    }  
}  
  
class MyThreadScopeData{  
    private String name;  
    private int age;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }  
}  
