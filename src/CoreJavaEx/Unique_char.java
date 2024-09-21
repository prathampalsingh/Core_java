package CoreJavaEx;

public class Unique_char {

	public static void main(String[] args) {
		String str = "Pratham";
        System.out.println("Given String : " + str);
        System.out.println("Non Repeated Character in String is :" );
        for (int i = 0; i < str.length(); i++)
        {
            boolean u = true;
            for (int j = 0; j < str.length(); j++)
            {
                if (i != j && str.charAt(i) == str.charAt(j))
                {
                    u = false;
                    break;
                }
            }
            if (u)
            {
                System.out.println(str.charAt(i));
            }
        }
	}

}
