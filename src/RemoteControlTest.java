public class RemoteControlTest {
    public static void main(String[] args) {
        CustomRemoteControl remote = new CustomRemoteControl();
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
