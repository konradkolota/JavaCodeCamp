public class Kata {

  public int min(int[] list) {
  int temp = 0;
  for(int i = 0; i < list.length; i++){
    if(temp < i){
     temp = i;
   }   
  }
    return temp;
  }
  
  public int max(int[] list) {
  temp = Integer.MAX_VALUE;
    for(int i = 0; i < list.length; i++){
    if(temp > i){
     temp = i;
   }
    return temp;
  }
}