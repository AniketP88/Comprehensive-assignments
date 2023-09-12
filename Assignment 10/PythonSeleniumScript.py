import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By

# Fixture to set up the WebDriver
@pytest.fixture(scope="module")
def setup_driver():
    # Initialize the WebDriver
    option = webdriver.ChromeOptions()
    driver = webdriver.Chrome(options = option)
     

    # Navigate to the URL
    driver.get("https://www.w3schools.com/")
    
    yield driver  
    
   
    driver.quit()

# Test case to verify the presence of the W3Schools logo
def test_w3schools_logo_presence(setup_driver):
    driver = setup_driver

    # Locate the W3Schools logo using its XPath
    w3schools_logo = driver.find_element(By.XPATH, "//*[@id='w3-logo']/i")
    
    # Check if the logo is displayed on the page
    assert w3schools_logo.is_displayed(), "W3Schools logo is not present on the page"

# Run the test using pytest
if __name__ == "__main__":
    pytest.main()
