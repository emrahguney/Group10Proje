Feature: Positions Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    And click on the element in LeftNav
      | humanResources      |
      | setupHumanResources |
      | positionsTab        |

  Scenario: Adding positions

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | SeniorJavaDevops |
      | shortName | SenJavaDev       |


    And click on the element in Dialog
      | saveButton |
    Then success message should be displayed

  Scenario: Editing Positions

    And user sending the key in Dialog Content
      | searchInput | SeniorJavaDevops |

    And user click on search button

    And edit item which added in first scenario
      | nameInput | JuniorJavaDevops |
      | shortName | JJD              |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Deleting Positions

    And user sending the key in Dialog Content
      | searchInput | JuniorJavaDevops |

    And user delete item from Dialog Content
      | JuniorJavaDevops |

    Then success message should be displayed