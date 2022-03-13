Feature: US_056 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 1. stepte "Ev Tipi" bilgisini girebilmeliyim.

  Background: Login ve ilgili sayfaya gitme
    Given kullanici "https://kese.nl/login" sayfasina gider
    Given kullanici "kullanici1@gmail.com" ve "1234" bilgileri ile sisteme giris yapar
    Given kullanici "https://kese.nl/new_room" sayfasina gider

  Scenario: US_056	TC_001	"Ev Tipi" başlığı görünür olmalıdır.
    Then kullanici ev tipi basliginin gorunur oldugunu dogrular

  Scenario: US_056	TC_002	"Odanız hangi ev türünde yer alıyor, belirtiniz." açıklaması görünür olmalıdır.
    Then kullanici ev tipi aciklamasinin gorunur oldugunu dogrular

  Scenario: US_056	TC_003	"Müstakil Ev", "Apartman Dairesi" ve "Stüdyo Daire"  seçenekleri görünür olmalıdır.
    Then kullanici ev tipi seceneklerinin gorunur oldugunu dogrular

  Scenario: US_056	TC_004	"Müstakil Ev", "Apartman Dairesi" ve "Stüdyo Daire"  seçenekleri seçilebilir olmalıdır.
    And kullanici mustakil ev secenegine tiklar
    And kullanici mustakil ev seceneginin secili oldugunu dogrular
    And kullanici apartman dairesi secenegine tiklar
    And kullanici apartman dairesi seceneginin secili oldugunu dogrular
    And kullanici studyo daire secenegine tiklar
    And kullanici studyo daire seceneginin secili oldugunu dogrular

  Scenario: US_056	TC_005	"Odami kiraya vermek istiyorum" ve "Karşılıklı oda değişimi yapmak istiyorum" checkboxları kullanılabilir olmalıdır.
    And kullanici odami kiraya vermek istiyorum secenegine tiklar
    And kullanici odami kiraya vermek istiyorum seceneginin secili oldugunu dogrular
    And kullanici karsilikli oda degisimi yapmak istiyorum secenegine tiklar
    And kullanici karsilikli oda degisimi yapmak istiyorum seceneginin secili oldugunu dogrular

  Scenario: US_056	TC_006	"1 / 11" yazısı görünür olmalıdır.
    Then kullanici step durumu bilgisinin "1 / 11" oldugunu dogrular
