#Author: your.email@your.domain.com
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @SuccesfullCase
  Scenario: Title of your scenario
    Given that Juan needs to create an employe in OrageHR
    When he performs the entry of the record in the application
      | Option | firstName | middleName | lastName | employeId | location               | userName  | status   | password     | confirmPassword | adminRole    | titlePopUp   |
      | PIM    | peityn    | tiendyn    | peityn   |      0444 | Australian Regional HQ | 1pepito24 | Disabled | 3158985879Ss | 3158985879Ss    | Global Admin | Add Employee |
    Then he visualize the new employe in the application
      | Option | employeeName          |
      | PIM    | peityn tiendyn peityn |
