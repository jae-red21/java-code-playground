class sumAvgWhile {
  public static void main(String args[]){
   int i=0,sum=0;
   while(i<=100){
    sum+=i;
    i++;
   }

  System.out.println("The sum is: "+sum);
  float avg= (float) sum/100;
  System.out.println("The average is: "+avg);

  }


}
