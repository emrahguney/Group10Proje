Feature: Bank Account Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Admin User should be able to Add Bank Account to positive test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | bankaccount  |

    And click on the element in Dialog

      | addButton |

    And user sending the key in Dialog Content

      | nameInput | 1012AB  |
      | iban | 123456  |

    And click on the element in Dialog

      | currency |
      | usd |
      | saveButton |

    Then success message should be displayed

  Scenario: Admin User should be able to Add Bank Account to negative test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | bankaccount  |

    And click on the element in Dialog

      | addButton |

    And user sending the key in Dialog Content

      | nameInput | 1012AB  |
      | ıban | 123456  |

    And click on the element in Dialog

      | currency |
      | usd |
      | saveButton |

    Then already exists message should be displayed


    Scenario: Admin User should be able to Edit Bank Account to positive test

      And click on the element in LeftNav
        | setup       |
        | parameters  |
        | bankaccount  |

      And click on the element in Dialog

        | editButton |

      And user sending the key in Dialog Content

        | nameInput | fdsfds  |
        | ıban | 4578312  |

      And click on the element in Dialog

        | saveButton |

      Then success message should be displayed

  Scenario: Admin User should be able to Delete Bank Account to positive test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | bankaccount  |

    And user sending the key in Dialog Content

      | searchInput       |1012AB|

    And user click on search button

    And user delete item from Dialog Content

      |1012AB|

    Then success message should be displayed

  Scenario: Admin User should be able to Delete Bank Account to negative test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | bankaccount  |

    And user sending the key in Dialog Content
      | searchInput | 1012AB |

    And user click on search button

    Then there is no data to display should be displayed












































