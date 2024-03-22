#Test Execution Number in Jira
Feature: CRM Application Upload Functionality

  User Story: As a user, I should be able to upload files and pictures for appreciation

  Background:
    Given  user is on the login page

    #Acceptance Criteria 1:
    #Verify that the user can upload files and pictures.
    #Supported file formats .pdf, .txt, .jpeg, .png, .docx
  @B32G8-246
  Scenario: HR user uploads files and pictures
    Given user enters the hr user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then user see the file uploaded

  @B32G8-247
  Scenario: HelpDesk user uploads files and pictures
    Given user enters the helpdesk user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then user see the file uploaded

  @B32G8-248
  Scenario: Marketing user uploads files and pictures
    Given user enters the marketing user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then user see the file uploaded


  #Acceptance Criteria 2:
  #Verify that the user can insert the files and images into the text.
  Scenario: HR User inserts files and images into the text
    Given user enters the hr user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then the user should click on Insert in text button
    ##And the file or image should be displayed appropriately within the appreciation box


  Scenario: HelpDesk User inserts files and images into the text
    Given user enters the helpdesk user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then the user should click on Insert in text button
    ##And the file or image should be displayed appropriately within the appreciation box

  Scenario: Marketing User inserts files and images into the text
    Given user enters the marketing user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then the user should click on Insert in text button
    ##And the file or image should be displayed appropriately within the appreciation box

    #Acceptance Criteria #3:
    #Verify that the user can remove files and images at any time before sending.

  Scenario: HR User removes files and images before sending
    Given user enters the hr user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then the user selects the option to remove a file or image

  Scenario: HelpDesk User removes files and images before sending
    Given user enters the helpdesk user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then the user selects the option to remove a file or image

  Scenario: Marketing User removes files and images before sending
    Given user enters the marketing user information
    When the user navigates to the upload page
    And the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx
    Then the user selects the option to remove a file or image
