Feature: US_012	Bir kullanıcı olarak "/login" sayfasına girdiğimde, şifremi unuttum bölümüne ulaşabilmeliyim

  Background:
    Given kullanici "https://kese.nl/login" sayfasina gider

  Scenario: TC_001	"Şifremi Unuttum" linki aktif ve görünür olmalıdır.
    Then kullanici "Şifremi Unuttum" linkinin aktif ve gorunur oldugunu dogrular

  Scenario:  TC_002	"Şifremi Unuttum" linkinin altı çizili olmalıdır.
    Then kullanici "Şifremi Unuttum" linkinin alti cizili oldugunu dogrular

  Scenario:  TC_003	Linke tıklanınca "http://test.kese.nl/forgot_password" sayfasına gidilmelidir.
    And kullanici "Şifremi Unuttum" linkine tiklar
    Then kullanici sayfa adresinin "/forgot_password" ifadesini icerdigini dogrular