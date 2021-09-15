public class MaskString{
    public static void main(String[] args) {
        String inputString = "Nitesh Patidar";
        System.out.println("Masked String : \n" + getMaskedString(inputString));
    }

    public static StringBuilder getMaskedString(String inputString){
        String []tokens = inputString.split(" ");
        System.out.println("Given String :\n"+inputString);
        StringBuilder builder = new StringBuilder();
        for (String string : tokens) 
        {
            builder.append(string.substring(0,2));
            int maskLength = string.length()-2;
            for (int i = 0; i < maskLength; i++) {
                builder.append("X");
            }
            builder.append(" ");
        }

        return builder;
    }

}