package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int activitiesNumber = Integer.parseInt(scanner.nextLine());
    float totalGrades = 0;
    int totalWeight = 0;

    for (int index = 1; index <= activitiesNumber; index += 1) {
      System.out.print("Digite o nome da atividade " + index + ": ");
      String activityName = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + index + ": ");
      int activityWeight = Integer.parseInt(scanner.nextLine());

      System.out.print("Digite a nota obtida para " + activityName + ": ");
      int activityGrade = Integer.parseInt(scanner.nextLine());

      totalGrades += (activityWeight * activityGrade);
      totalWeight += activityWeight;
    }
    float finalGrade = 0;
    if (totalWeight != 0) {
      finalGrade = totalGrades / totalWeight;
    } else {
      System.out.print("A pontuação final não pode ser calculada, pois o peso total é zero.");
    }

    if (finalGrade >= 85) {
      System.out.print("Parabéns! Você alcançou " + finalGrade + "%! E temos o prazer "
              + "de informar que você obteve aprovação!");
    } else {
      System.out.print("Lamentamos informar que, "
              + "com base na sua pontuação alcançada neste período, "
              + finalGrade
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
    scanner.close();
  }
}