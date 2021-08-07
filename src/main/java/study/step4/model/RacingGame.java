package study.step4.model;

import study.step4.model.car.Cars;
import study.step4.view.ResultView;

public class RacingGame {

  private final Cars cars;
  private final ResultView resultView;

  private final int racingGameRound;

  public RacingGame(int carNumber, int gameRound) {
    cars = Cars.of(carNumber);
    racingGameRound = gameRound;
    resultView = new ResultView();
  }

  public void start() {
    for(int i=0; i<racingGameRound; i++) {
      cars.move();
      resultView.printResult(cars.getRacingGameCars());
    }
  }

  public Cars getCars() {
    return cars;
  }

  public int getRacingGameRound() {
    return racingGameRound;
  }
}
