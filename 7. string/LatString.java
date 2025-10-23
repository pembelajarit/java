public class LatString {
    public static void main(String[] args) {
        String s1 = "Java";
        s1 = s1.concat(" Programming");
        System.out.println(s1);

        s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);  

        s1 = new String("Java");
        System.out.println(s1 == s2);

        s1 = "Hello";
        s2 = "World";
        String result = s1 + " " + s2;
        String result2 = s1.concat(" ").concat(s2);
        System.out.println(result);
        System.out.println(result2);

        s2 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        s2 = "Hello";
        System.out.println(s1 == s2);

        // String builder
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World");

        // Insert a string at a specific index
        sb.insert(6, "Java ");

        // Reverse the string
        sb.reverse();

        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Hello");

        // Append a string
        sb2.append(" World");

        // Delete a portion of the string
        sb2.delete(5, 11); // Deletes " World"

        System.out.println(sb2);  // Output: Hello

        // Performance Comparison
        long startTime = System.nanoTime();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb3.append(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sbf.append(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ns");
    }
}
