package lt20170330;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.Future;  
  
  
public class CallableAndFuture {  
    public static void main(String[] args) throws InterruptedException, ExecutionException {  
        //创建一个单一线程池(只有一个线程)  
        ExecutorService threadPool=Executors.newSingleThreadExecutor();  
          
        //这里我们如果不需要线程返回结果，我们使用threadPool.execute(command);  
        //如果我们需要线程返回结果，就使用submit(Callable<T> task)方法  
        //我们使用future来拿到线程执行后的结果。  
        Future<String> future = threadPool.submit(new Callable<String>(){  
            public String call() throws Exception {  
                Thread.sleep(2000);//睡2秒  
                return "HelloWorld";  
            }  
        });  
        System.out.println("等待结果...");  
        System.out.println("线程执行后的结果为:"+future.get()); 
        
      //固定大小的线程池，大小为10个线程  
        ExecutorService threadPool2 = Executors.newFixedThreadPool(10);  
        CompletionService<Integer> completionService   
            = new ExecutorCompletionService<Integer>(threadPool2);  
        //提交10个任务  
        for (int i = 1; i <= 10; i++) {  
            final int seq=i;  
            completionService.submit(new Callable<Integer>(){  
                public Integer call() throws Exception {  
                    //休眠5秒以内随机时间  
                    Thread.sleep(new Random().nextInt(5000));  
                    return seq;  
                }  
            });  
        }  
        //获取刚刚提交的线程任务的结果  
        for (int i = 1; i <= 10; i++) {  
            System.out.println(completionService.take().get());  
        }  
    }  
}  
