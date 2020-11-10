# Autor: Carlos
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: Searh for a automation course
    Given than brandon wants to learn automation at the academy Choucair
      | strUser  | strPassword  |
      | 1077459419 | Choucair2020*|
    When he search for the course on the Choucair Academy Platform
      | strCourse               |
      | ISTQB Agile Tester Extension |
    Then he finds the course called
      | strCourse               |
      | ISTQB Agile Tester Extension |