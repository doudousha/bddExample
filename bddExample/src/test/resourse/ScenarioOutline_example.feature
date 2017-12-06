Feature: Wikipedia Search
  Scenario Outline: TDD search on wikipedia
    Given 我访问 Wikipedia homepage
    When 我在名为"<Search>"的文本框输入"<Value>"
    When 我点击了按钮"<ButtonName>"
    Then 页面title包含"<Title>"
    Examples:
      | Search | Value | ButtonName | Title |
      | search | Test-driven development | go | Test-driven development |
