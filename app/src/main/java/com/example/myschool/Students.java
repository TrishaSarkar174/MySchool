package com.example.myschool;

import java.util.ArrayList;
import java.util.List;

public class Students {
    List<String> getStudents(String className){
      List<String> students = new ArrayList<>();

      if(className.equals("Play")){
          students.add("Rai");
          students.add("Adi");
          students.add("Sushmita");
      }else if(className.equals("Nursery")) {
          students.add("Abir");
          students.add("Mariya");
          students.add("Anuradha");
      }
      else if(className.equals("One")){
          students.add("Pronoy");
          students.add("Prottoy");
          students.add("Priom");
      }else if(className.equals("Two")){
          students.add("Trisha");
          students.add("Tripty");
          students.add("Tonni");
      } else if(className.equals("Three")){
          students.add("Puja");
          students.add("Punom");
          students.add("Prioshi");
      }else if(className.equals("Four")){
          students.add("Toma");
          students.add("Tonusri");
          students.add("Tonmoy");
      }else{
          students.add("Prothoma");
          students.add("Tania");
          students.add("Tonoya");
      }


      return students;
    }
}
