Feature: US001

  @us001
  Scenario: Gecerli bir SSN, 3. ve 5. rakamdan sonra "-"  icermeli ve 9 rakamdan olusmalidir
    Given Medunna ana sayfasina gider
    And Ana sayfa giris ikonuna tiklar
    And Register butonuna tiklar
    And ssn kutusuna gecerli bir ssn girer
    Then hata mesajinin cikmadigini test eder
    And tarayiciyi kapatir
