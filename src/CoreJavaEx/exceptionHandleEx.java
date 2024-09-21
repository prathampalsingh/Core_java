package CoreJavaEx;

public class exceptionHandleEx {

	public static void main(String[] args) {
		try {
			Class.forName("CoreJavaEx.FinalEx");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found"+e);
		}

	}

}
