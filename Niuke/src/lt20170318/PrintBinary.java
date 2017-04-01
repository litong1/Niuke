package lt20170318;
public class PrintBinary {
	   public static void main(String args[]){
	      PrintBinary s=new PrintBinary();
	      s.printBinaryInt(256);
	      s.printBinaryInt(~256);
	   }
	   void printBinaryInt(int i){
	      for(int j=31;j>=0;j--)
	          if(((1<<j)& i)!=0)
	              System.out.print("1");
	          else
	              System.out.print("0");
	          System.out.println();
	     
	   }
	}