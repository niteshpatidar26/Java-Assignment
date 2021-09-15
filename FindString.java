public class FindString{
  static int countOccurrences(String data, String word) 
{
    String a[] = data.split(" ");
    int count = 0;
    for (int i = 0; i < a.length; i++) 
    {
    if (word.equals(a[i]))
        count++;
    } 
    return count;
}
  
  public static void main(String args[]) 
  {
      String data = "Java is Object oriented. Java is platform independent.Java is simple.";
      String word = "Java";
      System.out.println(countOccurrences(data, word));
  }
}