package Difference;

class Difference{

	static void diffStringAndStringBuffer(String string,
			StringBuffer stringBuffer) {
		/*
		 * when Append somthing to string it create(Immutable)new object while
		 * String buffer changes in same object(Mutable)
		 */
		System.out.println("Difference Between " + string + " and "
				+ stringBuffer);
		System.out.println(string.concat(" is imutable"));
		System.out.println(stringBuffer.append(" is Mutable"));
	}
	
	static void diffStringAndStringBuilder(String string,
			StringBuilder stringBuilder) {
		System.out
				.println("\n--------------------------------------------------\n");
		System.out.println("Difference Between " + string + " and "
				+ stringBuilder);
		System.out.println(string.concat(" is imutable"));
		System.out.println(stringBuilder.append(" is Mutable"));
	}

	static void diffStringBufferAndStringBuilder(
			StringBuffer stringBuffer, StringBuilder stringBuilder) {
		System.out
				.println("\n--------------------------------------------------\n");
		System.out
				.println("Difference Between stringBuffer and stringBuilder ");

		long start = System.currentTimeMillis();
		concatWithStringBuffer(stringBuffer);
		System.out.println("Time taken by StringBuffer: "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		concatWithStringBuilder(stringBuilder);
		System.out.println("Time taken by StringBuilder: "
				+ (System.currentTimeMillis() - start) + "ms");
	}

	public static StringBuffer concatWithStringBuffer(StringBuffer stringBuffer) {
		for (int i = 0; i < 100000; i++) {
			stringBuffer.append("stringBuffer");
		}
		return stringBuffer;
	}

	public static StringBuilder concatWithStringBuilder(
			StringBuilder stringBuilder) {
		for (int i = 0; i < 100000; i++) {
			stringBuilder.append("StringBuilder");
		}
		return stringBuilder;
	}

}

public class MainClass {

	public static void main(String[] args) {
		String string = new String("String");
		StringBuffer stringBuffer = new StringBuffer("StringBuffer");
		StringBuilder stringBuilder = new StringBuilder("StringBuilder");

		Difference.diffStringAndStringBuffer(string, stringBuffer);
		Difference.diffStringAndStringBuilder(string, stringBuilder);
		Difference.diffStringBufferAndStringBuilder(stringBuffer, stringBuilder);

	}

	
}
