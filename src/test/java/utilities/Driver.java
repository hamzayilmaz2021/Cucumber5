package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    // Eğer bir class'tan NESNE ÜRETİLMESİNİ İSTEMİYORSANIZ
    // constructor'ı private yapabilirsiniz (Singleton Class)
    private Driver(){ }

    // WebDriver nesnemizi, static olarak oluşturduk, çünkü program başlar başlamaz
    // hafızada yer almasını istiyoruz.
    static WebDriver driver;

    // Programın herhangi bir yerinden getDriver() methodu çağırılarak
    // hafıza STATIC olarak oluşturulmuş DRIVER nesnesine erişebiliriz.
    // Yani yeniden WebDriver nesnesi oluşturmak zorunda değiliz.
    //Driver.getDriver()
    public static WebDriver getDriver(){
        // Eğer driver nesnesi hafızada boşsa, oluşturulmamışsa yeniden oluşturmana gerek yok.
        // Eğer null ise, yeniden oluşturabilirsin.
        // Sadece ilk çağırıldığında bir tane nesne üret, sonraki çağırmalarda var olan nesnesi kullan.
        if(driver == null){
            switch (ConfigurationReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Dimension d = new Dimension(120,120);
        //driver.manage().window().setSize(d);

        // Tarayıcıyı istediğimiz boyutta nasıl kullanabiliriz? 800x1200
        // Alt-Soru : WebSayfasının mobil testi nasıl yapılır..

        return driver;
    }

    public static void closeDriver(){
        // Eğer driver nesnesi NULL değilse, yani hafızada varsa
        if (driver != null){
            driver.quit();  // driver'ı kapat
            driver = null;  // driver'ı hafızadan temizle.
        }
    }



}




// EPIC -> Ev Değişimi Hizmeti

//        -> Ev Değişimi İlan Oluşturma - Epic
//           -->  Ev Tipi Seçimi - User Story
//           -->  Adres Bilgisi - User Story
//           -->  Kullanım Alanları - User Story

//        -> Ev Değişimi İlan Arama
//        -> Ev Değişimi İlan Görüntüleme


// User Story'ler bizim önümüze hazır olarak geliyor.. (Product Owner Yazıyor)
// Örnek :  100 US
// 5 tane tester = 2 Haftalık Sprintte 10 Gün = 5 * 10 = 50 Birimlik İş Yükü ---> Takım Kapasitesi
// 1. User Story => 8 Point
// 2. User Story => 5 Point
// 3. User Story => 3 Point
// 4. User Story => 2 Point
// 5. User Story => 8 Point
// 6. User Story => 8 Point
// 7. User Story => 8 Point
// 8. User Story => 5 Point
// 9. User Story => 3 Point

// 91..

// Sprint Planning Toplantısı ----> User Story Puanlama

//10. User Story => 5 Point
//11. User Story => 8 Point
//12. User Story => 3 Point

// 82..
// 70..

// As a <type of user>, I want <activity> so that <business value>.
// <Kullanıcı> olarak, <aktivite> gerçekleştirmek istiyorum. Böylece <fayda> sağlayabilirim.

// Ben bir kullanıcı olarak, ev tipi seçebilmek istiyorum. Böylece ilanların içerisinde sınıflandırma yapabilirim.
// Acceptance Criterias -> 1. Kullanıcı giriş ypamış olmalıdır.
//                         2. "Ev Tipi" başlığı ve "Değişim yapmak istediğiniz evinizin türünü belirtiniz" açıklaması görünür olmalıdır.
//                         3. "Müstakil Ev", "Apartman Dairesi", "Stüdyo Daire" seçenekleri görünür olmalıdır.