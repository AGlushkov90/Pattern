package behaivoral.chain_of_command;

public class Main {
    public static void main(String[] args) {
        Logger loggerInfo = new LoggerInfo(1);
        Logger loggerEmail = new LoggerEmail(2);
        Logger loggerTG = new LoggerTG(3);
        loggerInfo.setNextLogger(loggerEmail);
        loggerEmail.setNextLogger(loggerTG);
        loggerInfo.sendMessage(MessageLevel.ERROR, "Ошибка");
        loggerInfo.sendMessage(MessageLevel.WARNING, "Предупреждение");
        loggerInfo.sendMessage(MessageLevel.INFO, "Инфо");
    }
}
