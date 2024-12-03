# gICS Services Model

The `cm2.ecore`and `config.ecore` have been created starting from the `.wsdl` files, which, once you launch your gICS instance, are available under:

+ `http://<your-IP>::8080/gics/gicsManagementService?wsdl`
+ `http://<your-IP>::8080/gics/gicsService?wsdl`
+ `http://<your-IP>::8080/gics/gicsServiceWithNotification?wsdl`

They all add some operations, but make reference to the same `cm2` and `config` model. 

The `gicsServiceWithNotification` and `gicsService` contain some contradictory objects (same name but different features), so we stayed with the `gicsService` and ignore the `gicsServiceWithNotification`.