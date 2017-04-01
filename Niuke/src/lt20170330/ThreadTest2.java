package lt20170330;

public class ThreadTest2 {  
	  
    private static Data data = new Data();  
      
    public static void main(String[] args) {  
        data.setJ(0);  
        R1 r1=new R1(data);  
        R2 r2=new R2(data);  
        new Thread(r1).start();  
        new Thread(r1).start();  
        new Thread(r2).start();  
        new Thread(r2).start();  
          
    }  
      
    static class R1 implements Runnable{  
  
        private Data data;  
        public R1(Data data){  
            this.data=data;  
        }  
          
        public synchronized void run() {  
            data.add();  
        }  
          
    }  
  
    static class R2 implements Runnable{  
  
        private Data data;  
        public R2(Data data){  
            this.data=data;  
        }  
          
        public synchronized void run() {  
            data.minus();  
        }  
          
    }  
      
}  
  
class Data{  
      
    private int j;  
      
    public void setJ(int j){  
        this.j=j;  
    }  
  
    public synchronized void add(){  
        j++;  
        System.out.println(Thread.currentThread().getName()  
                +":j加上1，变为:"+j);  
    }  
      
    public synchronized void minus(){  
        j--;  
        System.out.println(Thread.currentThread().getName()  
                +":j减去1，变为:"+j);  
    }  
}  
