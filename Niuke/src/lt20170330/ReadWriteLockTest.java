package lt20170330;

import java.util.Random;  
import java.util.concurrent.locks.ReentrantReadWriteLock;  
  
public class ReadWriteLockTest {  
    public static void main(String[] args) {  
        final Queue q = new Queue();  
        for (int i = 0; i < 3; i++) {  
            new Thread(){  
                public void run(){  
                    while(true){  
                        q.get();  
                    }  
                }  
            }.start();  
              
            new Thread(){  
                public void run(){  
                    while(true){  
                        q.put(new Random().nextInt(10000));  
                    }  
                }  
            }.start();  
        }  
    }  
}  
  
  
class Queue{  
    private Object data = null;//共享数据，只有一个线程能写该数据，但可以有多个线程同时读该数据  
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();  
    public void get(){  
        rwl.readLock().lock();  
        try {  
            System.out.println(Thread.currentThread().getName().toString()+"准备读取数据");  
            Thread.sleep((long)Math.random()*1000);  
            System.out.println(Thread.currentThread().getName().toString()+"读取数据："+data);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }finally{  
            rwl.readLock().unlock();  
        }  
    }  
      
    public void put(Object data){  
        rwl.writeLock().lock();  
        try {  
            System.out.println(Thread.currentThread().getName().toString()+"准备改写数据");  
            Thread.sleep((long)Math.random()*1000);  
            this.data=data;  
            System.out.println(Thread.currentThread().getName().toString()+"改写数据为："+data);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }finally{  
            rwl.writeLock().unlock();  
        }  
    }  
}  
