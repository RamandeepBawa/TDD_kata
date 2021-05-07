class StringCalculator{
  public int Add(String numbers){
    if(numbers.length()==0)
       return 0;
    else{
      int[] arr=numbers.split(",");
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum=sum+a[i];
      }
      return sum;
    }
  }
}
