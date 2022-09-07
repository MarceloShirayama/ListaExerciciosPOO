package ExerciseFive;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String enrollment;
  private String name;
  private List<Double> gradeScores = new ArrayList<>();
  private double workScores;
  private double cutOffScore = 7.0;
  private double weightGrade = 2.5;
  private double weightWork = 2.0;

  public Student(
      String enrollment,
      String name,
      double cutOffScore) {
    this.enrollment = enrollment;
    this.name = name;
    this.cutOffScore = cutOffScore;
  }

  public void addGradeScore(double score) {
    this.gradeScores.add(0, score);
    ;
  }

  public void addWorkScores(double workScores) {
    this.workScores = workScores;
  }

  public String average() {
    double recoveryGrade;
    double grades = gradeScores
        .stream()
        .reduce(0.0, (subtotal, element) -> subtotal + element);

    double average = (grades * weightGrade + workScores * weightWork) /
        (weightGrade * gradeScores.size() + weightWork);

    if (average >= 7) {
      recoveryGrade = 0;
    } else {
      double weigthTotal = weightGrade * (gradeScores.size() + 1) + weightWork;
      double gradeOne = gradeScores.get(0);
      double gradeTwo = gradeScores.get(1);
      double topFormula = cutOffScore * weigthTotal - workScores * weightWork;
      recoveryGrade = topFormula / weightGrade - gradeOne - gradeTwo;
    }
    return String.format("Nota necessaria de recuperação: %.2f", recoveryGrade);
  }

  @Override
  public String toString() {
    return "Student [cutOffScore=" + cutOffScore + ", enrollment=" + enrollment + ", gradeScores=" + gradeScores
        + ", name=" + name + ", workScores=" + workScores + "]";
  }

}
