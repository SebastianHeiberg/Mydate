package com.company;

public class MyDate {

  private int day;
  private int month;
  private int year;
  final private int[] dagePåMåneden = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void setToNextDay() {
    if (month == 2) {
      checkLeapYear();
    }

    day += 1;

    if (day > dagePåMåneden[month]) {
      day = 1;
      setToNextMonth();
    }
  }

  private void setToNextMonth() {
    month += 1;
    if (month > 12) {
      month = 1;
      setToNextYear();
    }
  }

  private void setToNextYear() {
    year += 1;
  }

  private void checkLeapYear() {
    if (year % 4 == 0 && year % 100 != 0) {
      dagePåMåneden[2] = 29;
    } else {
      dagePåMåneden[2] = 28;
    }
  }

  @Override
  public String toString() {
    return "Dagens dato: " + day +
        "/" + month +
        "/" + year;
  }
}
