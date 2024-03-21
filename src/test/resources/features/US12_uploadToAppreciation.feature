@wip
Feature: CRM Application Upload Functionality

  User Story: As a user, I should be able to upload files and pictures for appreciation

  Background:
    Given  user is on the login page

  Scenario: HR user uploads files and pictures
    Given user enters the hr user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then user see the file uploaded



  Scenario: HelpDesk user uploads files and pictures
    Given user enters the helpdesk user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then user see the file uploaded


  Scenario: Marketing user uploads files and pictures
    Given user enters the marketing user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then user see the file uploaded


    #Then displays file in Appreciation message box
    #Then displays file in Appreciation message box
    #Then displays file in Appreciation message box