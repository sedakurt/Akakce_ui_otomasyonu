# UI Otomasyon Testi #
Bu projede Hepsiburada tarafından verilen Test otomasyon UI case' i oluşturulmuştur.

## Proje Özellikleri
* Selenium Cucumber Gherkin ile Java dilinde BDD yaklaşımı kullanılarak hazırlanmıştır.
* Url: https://hepsiburada.com
* Tarayıcı olarak GoogleChrome kullanıldı.
* Assertion için JUnit kütüphanesi kullanıldı.
* Webdriver, url gibi verilerin config dosyasından çağırılacağı bir properties dosyası oluşturuldu. 
* Raporlama için JUnit, TestRunner kullanıldı.

## Task İsterleri
•	Kullanıcı hepsiburada.com sitesini ziyaret eder.
•	Kullanıcı arama işlemi yapar (Örnek: “iphone” gibi popüler ve yorumu olan bir ürün)
•	Kullanıcı arama sonucunda gelen ürün listesinden ürün seçer ve ürün detay sayfasına gider.
•	Kullanıcı seçilen ürün için ürün detayda “Yorumlar” tabına gider.
•	Kullanıcı gelen yorumlar içerisinde ilk yorumun “Evet” butonuna basar.
•	Kullanıcı “Teşekkür Ederiz” yazısını görür.
•	Kullanıcı eğer yorumlar tab’ında hiç yorum gelmiyorsa herhangi bir işlem yapmaz.

Notlar:
•	Test yazılırken okunabilirlik, isimlendirmeler, kod tekrarı gibi standartlara dikkat edilmelidir.
•	Testler herhangi bir platformda yazılabilir(Java-Selenium,Ruby-Capybara,Python-Robot Framework gibi)

