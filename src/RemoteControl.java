public class RemoteControl {
    private static final int SIZE = 7;

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[SIZE];
        offCommands = new Command[SIZE];

        Command noCommand = new NoCommand();
        for(int i = 0; i < SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------- Remote Control ----------");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands.getClass().getName()
                    + "    " + offCommands.getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
