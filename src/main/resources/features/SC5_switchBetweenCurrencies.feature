@smoke

  Feature: Verify that US dollar selected first option
  Then First option is USD

    Scenario: Verify that user can select different currency
      When user select Euro
      Then The prices change successfully

