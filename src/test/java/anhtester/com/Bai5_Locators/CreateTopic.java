package anhtester.com.Bai5_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CreateTopic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang winio.content.com
        driver.get("https://stagingv2.admin.hypit.paditech.org/");
        Thread.sleep(1000);

        //Điền username
        //Tìm theo name với By.name()
        driver.findElement(By.name("user_name")).sendKeys("super_admin");
        Thread.sleep(1000);

        //Điền password
        driver.findElement(By.name("password")).sendKeys("12345678");

        Thread.sleep(1000);

        //Click Login
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/button")).click();//Xpath tuyệt đối bắt đầu bằng/

        driver.findElement(By.xpath("//span[contains(text(),'Quản lý chủ đề')]")).click();//Xpath tương đối bắt đầu bằng//
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@class='btn btn-white btn-icon-text my-2 mr-2 modal-effect']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='Nhập tên chủ đề']")).sendKeys("Khoa học huyền bí");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='Nhập số lượng kịch bản']")).sendKeys("50");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='Nhập độ dài kịch bản kịch bản']")).sendKeys("1400");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//textarea[@placeholder='Nhập hashtag']")).sendKeys("#Climate\n" +
                "#CarBrandEnthusiasts\n" +
                "#GeographicLearning\n" +
                "#GeographicAwareness\n" +
                "#GeographicConservation\n" +
                "#GeographicPhotography\n" +
                "#HumanGeography\n" +
                "#GeographicLandmarks\n" +
                "#Continents\n" +
                "#GeographicMigrations\n" +
                "#GeographicCulture\n" +
                "#GeographicLandUse\n" +
                "#GeographicFascination\n" +
                "#GeographicInformationSystems\n" +
                "#GeographicPopulation\n" +
                "#GeographicSpatialAnalysis\n" +
                "#Landscapes\n" +
                "#GeographicTourism\n" +
                "#UrbanGeography\n" +
                "#PhysicalGeography\n" +
                "#GeographicCulturalLandscape\n" +
                "#GeographicWonder\n" +
                "#GeographicDiscussion\n" +
                "#GeographicChallenges\n" +
                "#GeographicEcology\n" +
                "#RuralGeography\n" +
                "#GeographicExploration\n" +
                "#GeographicAdventurers\n" +
                "#GeographicDiversity\n" +
                "#GeographicDisasterManagement\n" +
                "#GeographicalPhenomena\n" +
                "#GeographicGeopolitics\n" +
                "#GeographicGIS\n" +
                "#GeographicUpdates\n" +
                "#GeographicTrends\n" +
                "#GeographicIssues\n" +
                "#GeographicAnalysis\n" +
                "#GeographicCuriosities\n" +
                "#GeographicGeology\n" +
                "#GeographicClimateChange\n" +
                "#GeographicSolutions\n" +
                "#EconomicGeography\n" +
                "#Geography\n" +
                "#GeographicJourney\n" +
                "#Oceans\n" +
                "#GeographicEnthusiasts\n" +
                "#GeographicBeauty\n" +
                "#Explore\n" +
                "#GeographicExcursions\n" +
                "#GeographicRegions\n" +
                "#GeographicWonders\n" +
                "#GeographicEcosystemServices\n" +
                "#CulturalSites\n" +
                "#GeographicInsights\n" +
                "#GeographicTravels\n" +
                "#Travel\n" +
                "#GeographicRemoteAreas\n" +
                "#GeographicExplorations\n" +
                "#GeographicChanges\n" +
                "#GeographicCulturalHeritage\n" +
                "#GeographicRemoteSensing\n" +
                "#GeographicAdventures\n" +
                "#GeographicBoundary\n" +
                "#GeographicVideography\n" +
                "#Cartography\n" +
                "#EnvironmentalGeography\n" +
                "#GeographicProtection\n" +
                "#GeographicTransportation\n" +
                "#GeographicResearch\n" +
                "#GeographicSustainability\n" +
                "#GeographicWaterResources\n" +
                "#Rivers\n" +
                "#GeographicEnvironmentalImpact\n" +
                "#GeographicCartography\n" +
                "#GeographicUrbanPlanning\n" +
                "#Deserts\n" +
                "#GeographicFacts\n" +
                "#GeographicFuture\n" +
                "#GeographicSustainableDevelopment\n" +
                "#GeographicEvents\n" +
                "#NaturalWonders\n" +
                "#GeographicTechnology\n" +
                "#GeographicExpeditions\n" +
                "#Islands\n" +
                "#Mountains\n" +
                "#GeographicDestinations\n" +
                "#PoliticalGeography\n" +
                "#GeographicSurvey\n" +
                "#GeographicStudies\n" +
                "#GeographicInfrastructure\n" +
                "#GeographicNaturalResources\n" +
                "#GeographicDiscoveries\n" +
                "#GeographicKnowledge\n" +
                "#GeographicResources\n" +
                "#GeographicClimate\n" +
                "#GeographicPerspectives\n" +
                "#GeographicData\n" +
                "#GeographicTraditions\n" +
                "#Ecosystems\n" +
                "#WorldHeritage\n" +
                "#GeographicDebate\n" +
                "#GeographicHumanEnvironmentInteraction\n" +
                "#GeographicPatterns\n" +
                "#GeographicInnovation\n" +
                "#GeographicExplorers\n" +
                "#GeographicMapping");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='bootstrap-tagsinput']//input[@type='text']")).sendKeys("Plant Physiology,  Plant Reproductive Strategies,  Biodiversity Conservation,  Animal Adaptation to Climate Change,  Ecosystem,  Life Sciences,  Animal Behavior,  Plant Anatomy,  Terrestrial Life,  Ethnobotany,  Ecological Research,  Biogeography,  Ecological Restoration Projects,  Biodiversity,  Animal Diversity,  Zoology,  Molecular Biology,  Biology,  Animal Pathology,  Microscopy,  Vertebrates,  Plant Biochemistry,  Botany,  Cell Biology,  Ornithology,  Environmental Science,  Environmental Conservation,  Insects,  Anatomy,  Plant Ecology Research,  Animal Ecology,  Animal Physiology Research,  Plant Life,  Animal Habitats,  Field Biology,  Marine Ecology,  Genetics,  Animal Anatomy,  Plant Anatomy and Morphology,  Animal-Fungi Interactions,  Pollination,  Plant Physiology Research,  Plant Growth,  Bioinformatics Analysis,  Ecology Research,  Animal Biochemistry,  Plant Evolutionary Biology,  Bioinformatics,  Plants,  Natural Selection,  Animals,  Community Ecology,  Animal Reproduction,  Science,  Animal Behavior Studies,  Population Ecology,  Nature Conservation,  Ecology Education,  Mammals,  Plant Conservation Efforts,  Physiology,  Animal Genetics,  Plant-Fungi Interactions,  Animal Conservation Efforts,  Plant Ecology,  Wildlife Conservation,  Plant Reproduction,  Invertebrates,  Animal Evolutionary Biology,  Animal Ecology Research,  Aquatic Life,  Wildlife Conservation Efforts,  Ethology,  Ecosystems,  Species Diversity,  Herpetology,  Animal Reproductive Strategies,  Nature,  Entomology,  Evolution,  Behavioral Ecology,  Animal Physiology,  Birds,  Ecology,  Wild Nature,  Marine Biology,  Animal Kingdom,  Endangered Species,  Wildlife,  Reptiles,  Plant Genetics,  Conservation,  Wildlife Rehabilitation,  Plant Pathology,  Conservation Efforts,  Adaptation,  Biotechnology,  Plant Adaptation to Climate Change,  Herbology,  Environmental Education,  Biochemistry,  Cellular Biology,  Plant Taxonomy,  Climate Change Impacts,  Scientific Discoveries,  Plant Genetics Research,  Plant Diversity,  Photosynthesis,");
        Thread.sleep(1000);


        driver.findElement(By.xpath("//a[@id='create_btn']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(text(),'Đồng ý')]")).click();
        Thread.sleep(1000);

        driver.quit();




    }
}
