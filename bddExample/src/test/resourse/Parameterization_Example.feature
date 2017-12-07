Feature: testsuite

  Scenario: 登录成功测试
    Given 访问系统登录页
    And 输入用户名"xiaoming"和密码"111111"
    When 点击登录
    Then 登录成功