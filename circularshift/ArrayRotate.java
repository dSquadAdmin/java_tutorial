class ArrayRotate{
  ArrayRotate(){
  }
  private void leftRotate(char[] array, int index){
	int count = 0;
	System.out.println("Shift Left");
  	while(count < index){
		char temp = array[0];
 	   	for(int i =0; i<array.length-1; i++){
 	    		array[i] = array[i+1];
 	   	}
 	   	array[array.length-1] = temp;
 	   	count++;
 	} 
	System.out.println(new String(array)); 
   
  }

 private void rightRotate(char[] array, int index){
	int count = 0;
	System.out.println("Shift Right");
  	while(count < index){
		char temp = array[array.length-1];
 	   	for(int i =1; i<array.length-1; i++){
 	    		array[i] = array[i-1];
 	   	}
 	   	array[0] = temp;
 	   	count++;
 	} 
	System.out.println(new String(array)); 
   
  }

  public static void main(String[] args){
  	char[] a = {'0', '1', '1', '1', '1'};
        try{
        	int index = Integer.parseInt(args[0]);
		ArrayRotate rotate = new ArrayRotate();
		System.out.println("Original Array:" + new String(a));
		rotate.leftRotate(a, index);
		rotate.rightRotate(a, index);
	}
	catch(Exception e){
		System.out.println("Usage: java ArrayRotate index");
	}
  }
}
