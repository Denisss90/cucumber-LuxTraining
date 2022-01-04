Feature: datatable transformation examples

  Scenario:  11
    Given Print table values
      | value 1 |
      | 222     |
      | value 3|

  Scenario:  22
    When  print user data
      | used1 | password |
      | user2 | qwerty   |
      | user3 | 123456   |

  Scenario:  33
    When  print user data map
      | used1 | password |
      | user2 | qwerty   |
      | user3 | 123456   |

  Scenario:  44
    When  print user data datatable
      | used1 | password |
      | user2 | qwerty   |
      | user3 | 123456   |

  Scenario:  55
    When  compare datatables
      | used1 | password |
      | user2 | qwerty   |
      | user3 | 123456   |

  Scenario:  66
    Given Find if received data matchers datatable
      | 1.5 |
      | 22.2     |
      | 3.0|