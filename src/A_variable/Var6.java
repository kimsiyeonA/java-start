package A_variable;

// 변수 초기화를 안한다면
public class Var6 {
    public static void main(String[] args) {
        int a;
        // System.out.println(a); // 오류가 나면서 실행되지 않음

        // 컴퓨터에서는 메모리는 여러 시스템이 함께 사용하는 공간
        // 계속 값들이 저장이 됨

        // 게임 레벨 숫자 7이 들어가 있음
        // 종료하면 메모리 숫자 7이 그대로 있음
        // 다른애가 메모리 공간을 쓰는 거임  >> 이렇게 그 메모리에 뭐가 들어 있는지 알 수 없을 때가있음
        // 기존 공간에 값이 뭐가 들어 있을지 모르니 자바는 변수를 초기화하도록 강제함

        // 지금 학습하는 변수는 지역변수, 개발자가 직접 초기화를 해주어야 함
        // 클래스 변수와 인스턴스 변수는 자바가 자동으로 초기화를 진행한다.

        // 컴파일 에러는 자바 문법에 맞지 않았을 때 발생하는 에러아디,
        // 컴파일 에러는 오류를 빨리, 그리고 명확하게 찾을 수 있기 때문에 빠르게 버그를 찾아서 고칠 수 있다.


    }
}
