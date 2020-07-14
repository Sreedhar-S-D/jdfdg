public class _tenth_10th {
    public static void main(String[] args) {
        System.out.println("");
        String g = "How are you";
        String h[] = g.split(" ");
        for( String t : h){
            System.out.println(t);
        }
        String r = "python python python java";
        r.replace("java", "python");
        String y[] = r.split(" ");
        for( int i = 0 ; i< y.length; i++)
        {
            if(y[i].equals("java"))
            {
                y[i] = "python";
            }
            else
            {
                y[i] = "java";
            }
        }
        for( String q: y)
        {
            System.out.println(q);
        }
        String s =



    }
}
