    class Simple{  
        public static void main(String args[]){  
         System.out.println("Hello Java");
         Other o = new Other();
        	o.fun();
        	First f = new First();
	        f.fun();
  
        }  
    }  
    class Other{
    	void fun(){
    		System.out.println("I'm working for digi360i");
    	}
    }
    //inheritance 

    class First extends Other{
    	void fun(){
    		System.out.println("I'm working for digi360i");
    	}
    }