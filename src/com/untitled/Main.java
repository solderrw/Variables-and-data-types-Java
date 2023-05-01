package com.untitled;

import java.sql.SQLOutput;

public class Main {

 public static void main(String[] args) {
  System.out.println("Переменные и типа данных");

   byte age = 127;
   short num1 = 128;
   int num2 = 56;
   long num3 = 4657;

   // byte - от -128 до 127 и занимает 1 байт
  // short - от -32768 до 32767 и занимает 2 байта
  // int - от -2147483648 до 2147483647 и занимает 4 байта
  // long - от -9 223 372 036 854  775 808 до 9 223 372 036 854 775 807 и занимает 8 байт

  float num4 = 4.523423f;
  double num5 = 5.3453455;


  char ch = '5';  //!@#$%^&*
  String user_name = "Alis";
  System.out.println(user_name);

  boolean inHappy = true;
  //boolean inHappy = false;
 }


}
