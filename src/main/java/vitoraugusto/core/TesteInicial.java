package vitoraugusto.core;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class TesteInicial {
	
	@Test
	public void testeLogin() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "/Volumes/Secundario/Driver/geckodriver");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().setSize(new Dimension(1200, 1200));
	  driver.get("https://app.smarttbot.com");
	  
	  //Login Usuário + Senha
	  
	  driver.findElement(By.id("login-username")).sendKeys("vitorqa");
	  Assert.assertEquals("vitorqa", driver.findElement(By.id("login-username")).getAttribute("value"));
	  Thread.sleep(600);	  
	  driver.findElement(By.id("login-password")).sendKeys("Teste123");
	  Assert.assertEquals("Teste123", driver.findElement(By.id("login-password")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  //Botão de Login
	  
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(6000);	  
	  
      //Botão para Criar o Bot
	  
	  driver.findElement(By.id("RunningInstances-create_instance_btn")).click();
	  Thread.sleep(1000);
	  
      //Criar Price
	
	  driver.findElement(By.id("select-strategy-413")).click();
	  Thread.sleep(600);
	  
	  //Criar Simulado
	  
	  driver.findElement(By.id("operation-mode-icon-simulated")).click();
	  Thread.sleep(600);
	  
	  //Configurar Bot
	  
	  driver.findElement(By.id("new_instance-name")).sendKeys("Heitor Villa-Lobos");
	  Assert.assertEquals("Heitor Villa-Lobos", driver.findElement(By.id("new_instance-name")).getAttribute("value"));
	  driver.findElement(By.id("next-step-button")).click();
	  Thread.sleep(4000);
	  
	  //Fechar Popup de Pós Criação
	  
	  driver.findElement(By.xpath("//div[2]/div/div[3]/button/span")).click();
	  Thread.sleep(2000);
	  
	  //Parametrização do Bot
	  
	  driver.findElement(By.xpath("//button[5]/span")).click();
	  Thread.sleep(600);
	  driver.findElement(By.xpath("//div[2]/div/div/button/span")).click();
	  Thread.sleep(600);
	  driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/div/div/div/div/button[2]/span")).click();
	  Thread.sleep(600);
	  driver.findElement(By.id("MAIN_RULE_spread")).clear();
	  driver.findElement(By.id("MAIN_RULE_spread")).sendKeys("5,00");
	  Assert.assertEquals("5,00", driver.findElement(By.id("MAIN_RULE_spread")).getAttribute("value"));
	  Thread.sleep(600);
	  driver.findElement(By.xpath("//div[3]/div/div/button[2]/span")).click();
	  Thread.sleep(600);
	  driver.findElement(By.xpath("//div[3]/div/div/div/button[2]/span")).click();
	  Thread.sleep(600);
	  driver.findElement(By.id("usingPriceDx")).click();
	  Thread.sleep(600);
	  driver.findElement(By.id("MAIN_RULE_price_dx")).clear();
	  driver.findElement(By.id("MAIN_RULE_price_dx")).sendKeys("10,00");
	  Assert.assertEquals("10,00", driver.findElement(By.id("MAIN_RULE_price_dx")).getAttribute("value"));
	  Thread.sleep(600);
	  driver.findElement(By.id("MPSG_partial_value1")).clear();
	  driver.findElement(By.id("MPSG_partial_value1")).sendKeys("150,00");
	  Assert.assertEquals("150,00", driver.findElement(By.id("MPSG_partial_value1")).getAttribute("value"));
	  Thread.sleep(600);
	  driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div[2]/div/div/button[2]/span")).click();
	  Thread.sleep(600);
	  driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div[3]/div/div/button[2]/span")).click();
	  Thread.sleep(600);
	  driver.findElement(By.id("MPSG_partial_value2")).sendKeys("250,00");
	  Assert.assertEquals("250,00", driver.findElement(By.id("MPSG_partial_value2")).getAttribute("value"));
	  Thread.sleep(600);
	  driver.findElement(By.id("SL_distance")).clear();
	  driver.findElement(By.id("SL_distance")).sendKeys("200,00");
	  Assert.assertEquals("200,00", driver.findElement(By.id("SL_distance")).getAttribute("value"));
	  Thread.sleep(600);
	  driver.findElement(By.id("SM_enabled")).click();
	  Thread.sleep(600);
	  driver.findElement(By.id("SM_begin")).sendKeys("150,00");
	  Assert.assertEquals("150,00", driver.findElement(By.id("SM_begin")).getAttribute("value"));
	  Thread.sleep(600);
	  driver.findElement(By.id("SM_distance")).sendKeys("95,00");
	  Assert.assertEquals("95,00", driver.findElement(By.id("SM_distance")).getAttribute("value"));
	  Thread.sleep(600);
	  driver.findElement(By.cssSelector(".fa-save")).click();
	  Thread.sleep(600);
	  driver.findElement(By.xpath("//div[3]/div/button[2]/span")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.cssSelector(".fa-play > path")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//a/button/span")).click();
	  Thread.sleep(600);
	  driver.findElement(By.xpath("//div[2]/div/div")).click();
	  Thread.sleep(600);
	  
	  
	  
	   }
					
	}
	

