Feature: US_001	Bir kullanıcı olarak ana sayfaya girdiğimde, "Seyahatin Tadını Çıkartın!" yazısını görebilmeliyim.

	Scenario: TC_001 "Seyahatin Tadını Çıkartın!" yazısı görünür olmalıdır.
      Given kullanici "https://kese.nl" sayfasina gider
      Then kullanici seyahatin tadini cikartin yazisinin gorunur oldugunu dogrular