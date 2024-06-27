public class count_letter {
    public static void main(String[] args) {
        String str = "aabbccabc";
        for(int i=0; i < str.length(); i++){
            int count =0;
            for(int j=0; j< str.length() ; j++){
                if(j<i && str.charAt(i)== str.charAt(j)){
                    break;
                }
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            
        } 
        if(count!=0)
        System.out.println(str.charAt(i)+ " occur "+ count +" times");      
    }
}
}
