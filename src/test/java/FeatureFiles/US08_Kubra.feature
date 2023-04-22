Feature: School Department Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Admin User should be able to Add School Departments Positive Test

    And click on the element in LeftNav
      |setup       |
      |schoolSetup |
      |Departments |

    And click on the element in Dialog
      |addButton |

    And user sending the key in Dialog Content
      |nameInput | Law |
      |codeInput | 1434 |

    And click on the element in Dialog
      |saveButton |

    Then success message should be displayed

  Scenario: Admin User should be able to Add School Departments Negative Test
    And click on the element in LeftNav
      |setup |
      |schoolSetup |
      |Departments |

    And click on the element in Dialog
      |addButton |

    And user sending the key in Dialog Content
      |nameInput | Law |
      |codeInput | 1434 |

    And click on the element in Dialog
      |saveButton |

    Then there is already department message should be displayed

  Scenario: Admin User should be able to Edit School Departments
    And click on the element in LeftNav
      |setup |
      |schoolSetup |
      |Departments |

    And edit item and click save button

    And success message should be displayed

  Scenario: Admin User should be able to Delete School Departments Positive Test
    And click on the element in LeftNav
      | setup       |
      | schoolSetup |
      | Departments |
    When user delete item from school department list
    Then success message should be displayed

  Scenario: Admin User should be able to Delete School Departments Negative Test
    And click on the element in LeftNav
      | setup       |
      | schoolSetup |
      | Departments |
    Then No result should found