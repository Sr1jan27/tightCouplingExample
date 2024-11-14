package com.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args) {
//        UserManager userManager = new UserManager();
//        System.out.println(userManager.getUserInfo());
        UserDataProvider dataProvider = new UserDatabaseProvider();
        System.out.println(dataProvider.getUserDetails());

        UserManager userManager = new UserManager(dataProvider);
        System.out.println(userManager.getUserInfo());
        UserDataProvider webserviceDataProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webserviceDataProvider);
        System.out.println(userManagerWithWS.getUserInfo());
    }
}
