class sumAvgDoWhile {
  public static void main(String args[]){ 
  int i=0,sum=0;
 do{
    sum+=i;
    i++;
  }while(i<=100); 

   System.out.println("The sum is: "+sum);
  float avg= (float) sum/100;
     System.out.println("The average is: "+avg);

  }
}
