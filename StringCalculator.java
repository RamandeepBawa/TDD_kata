class StringCalculator{
  public static int Add(String numbers){
    if(numbers.length()==0)
       return 0;
    else{
      String del=",";
      if(numbers.matches("//(.*)\n(.*)")){
        del = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
      }
      String[] arr=numbers.split(del + "|\n");
      int sum=0;
      String negative=""; 
	
      for(int i=0;i<arr.length;i++){
	int temp=Integer.parseInt(arr[i]);
	if(temp<0){
		if(negative.length()==0){
			negative=arr[i];
		}
		else{
			negative = negative + "," + arr[i];
		}
	}
	if(temp<1000){
	        sum=sum+temp;
	}
	if(negative.length()>0){
		throw new IllegalArgumentException("Negatives not allowed: " + negative);
	}
      }
      return sum;
    }
  }
  public static void main(String []args){
    System.out.println(Add("1,2"));
  }
}
