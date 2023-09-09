@regression
Feature: Verify dummy rest api endpoints

  Background:
    * url 'https://dummyjson.com/'

  Scenario: verify product endpoints and check the response
    Given path '/products'
    When method get
    Then status 200
    * print response
    #* karate.embed(response, "json")

  Scenario: verify product endpoints and check the response
    Given path '/products'
    When method get
    Then status 200
    * print response

  Scenario: verify carts endpoints and check the response
    Given path '/carts'
    When method get
    Then status 200
    * print response

  Scenario: verify users endpoints and check the response
    Given path '/users'
    When method get
    Then status 200
    * print response

  Scenario: verify posts endpoints and check the response
    Given path '/posts'
    When method get
    Then status 200
    * print response



