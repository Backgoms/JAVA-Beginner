
public class Test2_08 {

	public static void main(String[] args) {
		//명명법..
		int aaa= 10; // 문법적 변수명을 숫자로 시작하면안됨햄
		 
		//변수명은 문자와 숫자 그리고 특수문자 _$로 만
		int skdffk_223 = 10;

	//분법적으로 사용되는 키워드는 사용 불가
		// int int = 10; //키워드가 변수명에 붙어 실행불가
		
		//중요!!!!!- 필수는 아닌데 전새계 사람들이 모두다따
		//변수는 대문자로 시작가능하다 대문자로 시작하지않음
		//항상 소문자로 시작하고 2개의 워드가 조합될때 다음 워드의 첫글자는 대문자.
		
		int Score = 10; //x
		int ScoRe = 20; //x
		int score = 30; //O
		
		int studentscore = 20; //x
		int studentScore = 20; //o
		
		//스네이크 케이스 (C, C++)
		int student_score_value = 20;
		
		//카멜 케이스 (JAVA)
		
		int studentScoreValue = 30;
		
	}

}
