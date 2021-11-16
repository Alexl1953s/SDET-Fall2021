package strings.substring_method;

public class StringSubstringMethodEx {

    // public String substring(int startIndex) -> returns the string starting from the given index to the end of string
    // public String substring(int startIndex, int stopIndex) -> returns the string starting from starIndex to stopIndex

    public static void main(String[] args) {

        String str = "| timezone | start-time 10:22:001 | end-time 10:23:234 |";
        int indexOfFirstColon = str.indexOf(':');
        String startTime = str.substring(indexOfFirstColon-2, str.indexOf(" ", indexOfFirstColon));
        String endTime = str.substring(str.length()-11 ,str.length()-2);

        System.out.println(startTime);
        System.out.println(endTime);
    }
}
