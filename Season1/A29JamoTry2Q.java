//  .charAt(num) 이라는 함수를 mdn에서 읽어보면
//  num에 있는 문자열을 반환한다.
//  반복문과 조건문을 적절히 활용하면 원하는 문자열을 뽑을 수 있다.

package original;

public class A29JamoTry2Q {
	// 각각의 조건문을 받을 변수 선언
	int b = 0, c = 0, d = 0, e = 0, z = 0;
	// 메서드 개막
	public void asdf(String a) {
		// 공백 자르고
		String b = a.replace(" ", "");
		// 특수문자 자르기.
		String c = b.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");
		// 잘 잘렸는지 한 번 프린트해 보고
		System.out.println(c);
		
		// 문자열의 길이만큼 도는 반복문 개막
		for (int i = 0; i < c.length(); i++) {
			// 모음의 갯수를
			if (
					c.charAt(i) == 'a' || 
					c.charAt(i) == 'e' || 
					c.charAt(i) == 'i' || 
					c.charAt(i) == 'o' || 
					c.charAt(i) == 'u') {
			
				// 변수에 담아두고
				d++;
				// 아닌 건 다른 거에 넣어둔다.
			} else e++;
		}
		// 프린트
		
		System.out.println("모음 : " + d);
		System.out.println("자음 : " + e);
	}


	public static void main(String[] args) {
		A29JamoTry2Q gg = new A29JamoTry2Q();
		gg.asdf("Programming is fun! right?");

	}

}
