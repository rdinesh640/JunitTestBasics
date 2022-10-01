package org.example;

import org.springframework.util.StringUtils;

public class Employee {
  public String findEmploye(String employeeId, String callerId){
      if(employeeId.length() > 8){
          return "IT Dpeartment";
      }
      else if (employeeId.length() < 8) {
              return "Software Deparment";
          }
      if(callerId.length()<10){
          return "Azure Deparment";
      }
      else if (callerId.length() > 10) {
              return "Aws Deparment";
          }
      else{
          return "no Deparment Found";
      }
  }

}
