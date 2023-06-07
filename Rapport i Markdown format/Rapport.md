# Använda paket

- **JUnit:** Används för att skapa och köra våra enhetstester. JUnit tillhandahåller en uppsättning annoteringar och assertions för att skriva tester, organisera dem och kontrollera resultat.

- **Mockito:** Användes för att skapa mock-objekt. Mockito gör det möjligt att simulera och testa klasser som är beroende av andra klasser (som i vårt fall, WeatherService beroende av WeatherAPI).

## Test-Driven Development (TDD)

TDD innebär att man först skriver tester och därefter kod. Det innebär att för varje metod skriver man först ett test som misslyckas, och därefter utformar man metoden så att den uppfyller kraven i testet. TDD hjälper till att säkerställa hög kodkvalitet, minskar risken för buggar och gör koden mer underhållbar.

## Mock-Object

Genom att använda mock-objekt kan vi skapa kontrollerade scenarier för våra tester. Vi kan till exempel simulera olika typer av svar från en API, olika typer av fel, och så vidare. Detta gör det möjligt att testa koden i olika situationer och att hitta fel och problem

# Testöversikt

Jag har utfört enhetstester på WeatherService klassen. Dessa tester är inriktade på att kontrollera metoderna som ansvarar för att hämta temperatur, vindhastighet och molnighet från WeatherAPI.

Testerna utfördes med hjälp av JUnit och Mockito för att mocka WeatherAPI.

## Följande tester har utförts:

- Test av temperaturhämtning: Jag testade om getTemperature() returnerar det förväntade värdet som vi mockade i WeatherAPI.

- Test av vindhastighetshämtning: Jag testade om getWindSpeed() returnerar det förväntade värdet som vi mockade i WeatherAPI.

- Test av molnighethämtning: Jag testade om getCloudiness() returnerar det förväntade värdet som vi mockade i WeatherAPI.

## Resultat

- Test av temperaturhämtning: Testet passerade. getTemperature() returnerade det förväntade värdet.

- Test av vindhastighetshämtning: Testet passerade. getWindSpeed() returnerade det förväntade värdet.

- Test av molnighethämtning: Testet passerade. getCloudiness() returnerade det förväntade värdet.

# Pålitlighet och problem

Baserat på resultaten från testerna, anser jag att WeatherService klassen är tillförlitlig när det gäller att hämta data från WeatherAPI. Metoderna getTemperature(), getWindSpeed(), och getCloudiness() verkar fungera korrekt och returnerar de förväntade värdena.

Jag hittade inga problem eller fel under testningen. Alla tester passerade och ingen exception kastades.

# Rapportförfattare och Markdown Konvertering

Denna rapport har skrivits av mig. Konverteringen till Markdown-formatet har utförts av ChatGPT, en AI utvecklad av OpenAI.