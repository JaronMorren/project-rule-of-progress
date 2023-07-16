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

    for (int index = 1; index <= activitiesNumber; index += 1) {
      System.out.print("Digite o nome da atividade " + index + ": ");
      String activityName = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + index + ": ");
      int activityWeight = Integer.parseInt(scanner.nextLine());

      System.out.print("Digite a nota obtida para " + activityName + ": ");
      int activityGrade = Integer.parseInt(scanner.nextLine());
    }
    scanner.close();
  }
}