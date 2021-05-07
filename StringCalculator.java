class StringCalculator{
  public static int Add(String numbers){
    if(numbers.length()==0)
       return 0;
    else{
      String[] arr=numbers.split(",");
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum=sum+Integer.parseInt(arr[i]);
      }
      return sum;
    }
  }
  public static void main(String []args){
    System.out.println(Add("1,2"));
  }
}
