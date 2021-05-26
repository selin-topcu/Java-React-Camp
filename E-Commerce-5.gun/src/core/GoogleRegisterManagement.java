package core;

import GoogleMessage.GoogleMessage;

public class GoogleRegisterManagement implements GoogleService{
    @Override
    public void registerToSystem(String message) {
        GoogleMessage googlemessage = new GoogleMessage();
        GoogleMessage.send(message);
    }
}
