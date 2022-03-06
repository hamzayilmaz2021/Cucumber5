Feature: US_010	Bir kullanıcı olarak "/login" sayfasına girdiğimde, login için gerekli inputlar kullanılabilir olmalıdır.

  Background:
    Given kullanici "https://kese.nl/login" sayfasina gider

  Scenario: TC_001	Email inputu kullanılabilir olmalıdır.
    Then kullanici login sayfasinda email inputunun kullanilabilir oldugunu dogrular

  Scenario: TC_002 Şifre inputu kullanılabilir olmalıdır.
    Then kullanici login sayfasinda password inputunun kullanilabilir oldugunu dogrular

  Scenario: TC_003	Email inputu için "placeholder" değeri "Email giriniz" olmalıdır.
    Then kullanici login sayfasinda email inputunun placeholder degerinin "Email giriniz" oldugunu dogrular

  Scenario: TC_004	Şifre inputu için "placeholder" değeri "Şifrenizi giriniz" olmalıdır.
    Then kullanici login sayfasinda password inputunun placeholder degerinin "Şifrenizi giriniz" oldugunu dogrular