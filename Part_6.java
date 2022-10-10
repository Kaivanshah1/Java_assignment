class Part_6 implements Runnable{  
    public void run(){  
    System.out.println("Hello World !");  
    }  
      
    public static void main(String args[]){  
    Part_6 m1=new Part_6();  
    Thread t1 =new Thread(m1);   
    t1.start();  
     }  
    }  
