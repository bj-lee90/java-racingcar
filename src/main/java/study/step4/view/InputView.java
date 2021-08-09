package study.step4.view;

import java.util.Scanner;
import study.step4.model.view.Input;

public class InputView {

    public static final Scanner scanner = new Scanner(System.in);

    public Input getUserInput() {
        return new Input(getCarNames(), getRacingGameRound());
    }

    public int getCarNumber() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public int getRacingGameRound() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
