Feature: Position Category Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Add Position Category
    And click on the element in LeftNav
      | humanResources      |
      | setupHumanResources |
      | positionCategories  |

    And click on the element in Dialog
      | addButton |

    And user sending the key in Dialog Content
      | nameInput | Head Officer |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Edit Position Category
    And click on the element in LeftNav
      | humanResources      |
      | setupHumanResources |
      | positionCategories  |

    And click on the element in Dialog
      | editButton |

    And edit item from Dialog Content

    And user sending the key in Dialog Content
      | nameInput | manager |

    And click on the element in Dialog
      | saveButton |

    Then success message should be displayed

  Scenario: Delete Position Category
    And click on the element in LeftNav
      | humanResources      |
      | setupHumanResources |
      | positionCategories  |

    And user delete item from Dialog Content
      | manager |

    Then success message should be displayed







