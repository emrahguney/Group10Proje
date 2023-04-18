Feature: Add Grade Levels Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Admin User should be able to Add Grade Levels positive test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | grandLevels |

    And click on the element in Dialog
      | addGradeLevels |

    And user sending the key in Dialog Content
      | nameInput  | 1012AB |
      | shortName  | 1012AB |
      | orderInput | 12     |

    And click on the element in Dialog
      | nextGradeBtn   |
      | nextGradeInput |
      | saveButton     |

    Then success message should be displayed


  Scenario: Admin User should be able to Add Grade Levels negative test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | grandLevels |

    And click on the element in Dialog
      | addGradeLevels |

    And user sending the key in Dialog Content
      | nameInput  | 1012AB |
      | shortName  | 1012AB |
      | orderInput | 14     |

    And click on the element in Dialog
      | nextGradeBtn   |
      | nextGradeInput |
      | saveButton     |

    Then already exists message should be displayed

  Scenario: Admin User should be able to Edit Grade Levels positive test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | grandLevels |

    And click on the element in Dialog
      | editGradeInput |

    And user sending the key in Dialog Content
      | orderInput | 7 |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed


  Scenario: Admin User should be able to Delete Grade Levels positive test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | grandLevels |

    And click on the element in Dialog
      | nameHeadBtn |

    And user delete item from Grade levels
      | deleteGradeLevelPos |

    And click on the element in Dialog

      | deleteDialogBtn |

    Then success message should be displayed


  Scenario: Admin User should be able to Delete Grade Levels negative test

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | grandLevels |

    And click on the element in Dialog
      | nameHeadBtn |

    And user delete item from Grade levels
      | deleteGradeLevelNeg |

    And click on the element in Dialog

      | deleteDialogBtn |

    Then negative test message should be displayed

  Scenario: Admin User should have an option to activate and deactivate grade levels.

    And click on the element in LeftNav
      | setup       |
      | parameters  |
      | grandLevels |

    And click on the element in Dialog
      | slideToggleBtn |

    Then success message should be displayed