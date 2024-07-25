Feature: Cadastro

    Scenario: Cadastro com sucesso
        Given User is on Homepage 
        And User clicks on the login button 
        When User enters a name in the name field 
        And User enters an email in the email field 
        Then User should be redirected to SignUp page. 

    Scenario: Cadastro com email já existente
        Given User is on Homepage 
        And User clicks on the login button 
        When User enters a name in the name field 
        And User enters an existing email in the email field 
        Then User should get an error message 
