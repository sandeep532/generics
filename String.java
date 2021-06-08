public class String{
    public static void main(String args[]){
      String str1="apple";
      String str2="Banana";
      String str3="Peach";
      String max=str1;
      if(str2.compareTo(max)>0)
       {
         max=str2;
       }
       if(str3.compareTo(max)>0)
       {
         max=str3;
       }
     

       
   System.out.println(max);
       
   }
}