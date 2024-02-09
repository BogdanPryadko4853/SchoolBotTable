package org.javaschoolbot.schoolivnyabot.service;


import lombok.extern.slf4j.Slf4j;
import org.javaschoolbot.schoolivnyabot.KeyBoard.KeyBoard;
import org.javaschoolbot.schoolivnyabot.config.BotConfig;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Objects;


@Slf4j
@Component
public class TelegramBot extends TelegramLongPollingBot {

    public static String previousState;
    public String classes;

    final BotConfig config;

    public TelegramBot(BotConfig config) {
        this.config = config;
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }

    @Override
    public String getBotToken() {
        return config.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if ("/start".equals(messageText)) {
                startCommandRecieved(chatId, update.getMessage().getChat().getFirstName());
            } else if ("расписание\uD83D\uDCDA".equals(messageText)) {
                startCommandRecieved2(chatId, update.getMessage().getChat().getFirstName());
            } else if ("Расписание для учеников👩‍🎓👨‍🎓".equals(messageText)) {
                startCommandRecieved3(chatId, update.getMessage().getChat().getFirstName());
            } else if ("сайт школы\uD83D\uDCBB".equals(messageText)) {
                goToSchoolWebsite(chatId);
            } else if ("вк\uD83D\uDCF1".equals(messageText)) {
                goToSchoolVk(chatId);
            } else if ("Назад\uD83D\uDD19".equals(messageText)) {
                goBack(chatId);
            } else if ("В главное меню🔙".equals(messageText)) {
                goMenuBack(chatId);
            } else if ("Назад".equals(messageText)) {
                startCommandRecieved3(chatId, update.getMessage().getChat().getFirstName());
            } else if ("Телеграмм☎\uFE0F".equals(messageText)) {
                goToSchoolTelegram(chatId);
            } else if ("5".equals(messageText)) {
                startCommandRecievedDayFor5(chatId, update.getMessage().getChat().getFirstName());
            } else if ("Понедельник".equals(messageText) && Objects.equals(classes, "five")) {
                try {
                    Table5_1(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Вторник".equals(messageText) && Objects.equals(classes, "five")) {
                try {
                    Table5_2(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Среда".equals(messageText) && Objects.equals(classes, "five")) {
                try {
                    Table5_3(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Четверг".equals(messageText) && Objects.equals(classes, "five")) {
                try {
                    Table5_4(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Пятница".equals(messageText) && Objects.equals(classes, "five")) {
                try {
                    Table5_5(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Понедельник".equals(messageText) && Objects.equals(classes, "6")) {
                try {
                    Table6_1(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Вторник".equals(messageText) && Objects.equals(classes, "6")) {
                try {
                    Table6_2(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Среда".equals(messageText) && Objects.equals(classes, "6")) {
                try {
                    Table6_3(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Четверг".equals(messageText) && Objects.equals(classes, "6")) {
                try {
                    Table6_4(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Пятница".equals(messageText) && Objects.equals(classes, "6")) {
                try {
                    Table6_5(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Понедельник".equals(messageText) && Objects.equals(classes, "7")) {
                try {
                    Table7_1(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Вторник".equals(messageText) && Objects.equals(classes, "7")) {
                try {
                    Table7_2(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Среда".equals(messageText) && Objects.equals(classes, "7")) {
                try {
                    Table7_3(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Четверг".equals(messageText) && Objects.equals(classes, "7")) {
                try {
                    Table7_4(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Пятница".equals(messageText) && Objects.equals(classes, "7")) {
                try {
                    Table7_5(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Понедельник".equals(messageText) && Objects.equals(classes, "8")) {
                try {
                    Table8_1(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Вторник".equals(messageText) && Objects.equals(classes, "8")) {
                try {
                    Table8_2(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Среда".equals(messageText) && Objects.equals(classes, "8")) {
                try {
                    Table8_3(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Четверг".equals(messageText) && Objects.equals(classes, "8")) {
                try {
                    Table8_4(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Пятница".equals(messageText) && Objects.equals(classes, "8")) {
                try {
                    Table8_5(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Понедельник".equals(messageText) && Objects.equals(classes, "9")) {
                try {
                    Table9_1(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Вторник".equals(messageText) && Objects.equals(classes, "9")) {
                try {
                    Table9_2(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Среда".equals(messageText) && Objects.equals(classes, "9")) {
                try {
                    Table9_3(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Четверг".equals(messageText) && Objects.equals(classes, "9")) {
                try {
                    Table9_4(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Пятница".equals(messageText) && Objects.equals(classes, "9")) {
                try {
                    Table9_5(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Понедельник".equals(messageText) && Objects.equals(classes, "10")) {
                try {
                    Table10_1(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Вторник".equals(messageText) && Objects.equals(classes, "10")) {
                try {
                    Table10_2(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Среда".equals(messageText) && Objects.equals(classes, "10")) {
                try {
                    Table10_3(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Четверг".equals(messageText) && Objects.equals(classes, "10")) {
                try {
                    Table10_4(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Пятница".equals(messageText) && Objects.equals(classes, "10")) {
                try {
                    Table10_5(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Понедельник".equals(messageText) && Objects.equals(classes, "11")) {
                try {
                    Table11_1(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Вторник".equals(messageText) && Objects.equals(classes, "11")) {
                try {
                    Table11_2(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Среда".equals(messageText) && Objects.equals(classes, "11")) {
                try {
                    Table11_3(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Четверг".equals(messageText) && Objects.equals(classes, "11")) {
                try {
                    Table11_4(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Пятница".equals(messageText) && Objects.equals(classes, "11")) {
                try {
                    Table11_5(chatId, update.getMessage().getChat().getFirstName());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if ("Расписание звонков\uD83D\uDD14".equals(messageText)) {
                goToTableAlarm(chatId, update.getMessage().getChat().getFirstName());
            } else if ("6".equals(messageText)) {
                startCommandRecievedDayFor6(chatId, update.getMessage().getChat().getFirstName());
            } else if ("7".equals(messageText)) {
                startCommandRecievedDayFor7(chatId, update.getMessage().getChat().getFirstName());
            } else if ("8".equals(messageText)) {
                startCommandRecievedDayFor8(chatId, update.getMessage().getChat().getFirstName());
            } else if ("9".equals(messageText)) {
                startCommandRecievedDayFor9(chatId, update.getMessage().getChat().getFirstName());
            } else if ("10".equals(messageText)) {
                startCommandRecievedDayFor10(chatId, update.getMessage().getChat().getFirstName());
            } else if ("11".equals(messageText)) {
                startCommandRecievedDayFor11(chatId, update.getMessage().getChat().getFirstName());
            } else if ("назад◀\uFE0F".equals(messageText)) {
                startCommandRecieved2(chatId, update.getMessage().getChat().getFirstName());
            }
        }
    }

    private void startCommandRecieved(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboard();

        String answer = "Привет, " + name;
        log.info("Replied to user " + name);


        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecieved2(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboard2();

        String answer = "Выберете, для кого хотите посмотреть рассписание, " + name;
        log.info("Replied to user " + name);
        previousState = "расписание";

        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecieved3(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardClasses();

        String answer = name + " ," + "введите свой класс";
        log.info("Replied to user " + name);
        previousState = "номер класса";
        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

//    private void startCommandRecievedAlarm(long chatId, String name) {
//        // Получаем клавиатуру
//        KeyBoard keyBoard = new KeyBoard();
//
//        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboard3();
//
//        String answer = name + " ," + "введите свою фамилию (Например-Шубная), ";
//        log.info("Replied to user " + name);
//        previousState = "учителя";
//
//        // Отправляем сообщение с клавиатурой
//        sendMessage(chatId, answer, keyboardMarkup);
//    }


    private void sendMessage(long chatId, String textToSend, ReplyKeyboardMarkup keyboardMarkup) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(keyboardMarkup); // Установка клавиатуры в сообщение

        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Error occurred:  " + e.getMessage());
        }
    }

    private void goToSchoolWebsite(long chatId) {
        String websiteURL = "https://shkola2ivnya-r31.gosweb.gosuslugi.ru/"; // Замените на URL вашего сайта

        String text = "Переход на [главный сайт школы](" + websiteURL + ")";

        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(text);
        message.enableMarkdown(true); // Включаем поддержку Markdown

        try {
            execute(message); // Отправляем сообщение для перехода по ссылке
        } catch (TelegramApiException e) {
            log.error("Error sending message: " + e.getMessage());
        }
    }

    private void goToSchoolVk(long chatId) {
        String websiteURL = "https://vk.com/club216432887"; // Замените на URL вашего сайта

        String text = "Переход на [сайт школы Вк](" + websiteURL + ")";

        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(text);
        message.enableMarkdown(true); // Включаем поддержку Markdown

        try {
            execute(message); // Отправляем сообщение для перехода по ссылке
        } catch (TelegramApiException e) {
            log.error("Error sending message: " + e.getMessage());
        }
    }

    private void goToSchoolTelegram(long chatId) {
        String websiteURL = "https://t.me/+jG81tl27nqRhYTIy"; // Замените на URL вашего сайта

        String text = "Переход на [сайт школы Телеграмм](" + websiteURL + ")";

        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(text);
        message.enableMarkdown(true); // Включаем поддержку Markdown

        try {
            execute(message); // Отправляем сообщение для перехода по ссылке
        } catch (TelegramApiException e) {
            log.error("Error sending message: " + e.getMessage());
        }
    }

    private void goBack(long chatId) {
        KeyBoard keyBoard = new KeyBoard();

        if ("учителя".equals(previousState)) {
            ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboard2();
            String answer = "Вы вернулись назад";
            sendMessage(chatId, answer, keyboardMarkup);
        } else if ("номер класса".equals(previousState)) {
            ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboard2();
            String answer = "Вы вернулись назад";
            sendMessage(chatId, answer, keyboardMarkup);
        } else if ("".equals(previousState)) {
            ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardStart();
            String answer = "Вы вернулись назад";
            sendMessage(chatId, answer, keyboardMarkup);
        }
    }

    private void goMenuBack(long chatId) {
        KeyBoard keyBoard = new KeyBoard();
        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboard();
        String answer = "Вы вернулись в главное меню";
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecievedDayFor5(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardDayClassesNumber5();

        String answer = name + " ," + "выберете день недели";
        log.info("Replied to user " + name);
        previousState = "день";
        classes = "five";

        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecievedDayFor6(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardDayClassesNumber6();

        String answer = name + " ," + "выберете день недели";
        log.info("Replied to user " + name);
        previousState = "день";
        classes = "6";

        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecievedDayFor7(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardDayClassesNumber7();

        String answer = name + " ," + "выберете день недели";
        log.info("Replied to user " + name);
        previousState = "день";
        classes = "7";

        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecievedDayFor8(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardDayClassesNumber8();

        String answer = name + " ," + "выберете день недели";
        log.info("Replied to user " + name);
        previousState = "день";
        classes = "8";

        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecievedDayFor9(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardDayClassesNumber9();

        String answer = name + " ," + "выберете день недели";
        log.info("Replied to user " + name);
        previousState = "день";
        classes = "9";

        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecievedDayFor11(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardDayClassesNumber11();

        String answer = name + " ," + "выберете день недели";
        log.info("Replied to user " + name);
        previousState = "день";
        classes = "11";

        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    private void startCommandRecievedDayFor10(long chatId, String name) {
        // Получаем клавиатуру
        KeyBoard keyBoard = new KeyBoard();

        ReplyKeyboardMarkup keyboardMarkup = keyBoard.createKeyboardDayClassesNumber11();

        String answer = name + " ," + "выберете день недели";
        log.info("Replied to user " + name);
        previousState = "день";
        classes = "10";

        // Отправляем сообщение с клавиатурой
        sendMessage(chatId, answer, keyboardMarkup);
    }

    public void Table5_1(long chatId, String name) throws TelegramApiException {
        String answer = "Разговоры о важном\n" + "2.Литература\n" + "3.Озбж\n" + "4.математика\n" + "5.биология\n" + "6.изо\n" + "7.английский язык";

        sendMessage2(chatId, answer);
    }

    public void Table5_2(long chatId, String name) throws TelegramApiException {
        String answer = "1.английский язык\n" + "2.Физическая культура\n" + "3.Технология\n" + "4.Технология\n" + "5.Русский язык";
        sendMessage2(chatId, answer);
    }

    public void Table5_3(long chatId, String name) throws TelegramApiException {
        String answer = "1.Математика\n" + "2.Физическая культура\n" + "3.История\n" + "4.Математика\n" + "5.Русский язык\n" + "6.Русский язык";
        sendMessage2(chatId, answer);
    }

    public void Table5_4(long chatId, String name) throws TelegramApiException {
        String answer = "1.Математика\n" + "2.Литература\n" + "3.География\n" + "4.Музыка\n" + "5.Русский язык\n" + "6.Физическая культура";
        sendMessage2(chatId, answer);
    }

    public void Table5_5(long chatId, String name) throws TelegramApiException {
        String answer = "1.ОДНКНР\n" + "2.Русский язык\n" + "3.История\n" + "4.Английский язык\n" + "5.Математика\n" + "6.Литература";
        sendMessage2(chatId, answer);
    }

    public void Table6_1(long chatId, String name) throws TelegramApiException {
        String answer = "Разговоры о важном\n" + "2.Математика\n" + "3.Русский язык\n" + "4.Физическая культура\n" + "5.Изо\n" + "6.Русский язык\n" + "7.Музыка";
        sendMessage2(chatId, answer);
    }

    public void Table6_2(long chatId, String name) throws TelegramApiException {
        String answer = "1.Математика\n" + "2.Литература\n" + "3.Русский язык\n" + "4.История\n" + "5.Технология\n" + "6.Технология";
        sendMessage2(chatId, answer);
    }

    public void Table6_3(long chatId, String name) throws TelegramApiException {
        String answer = "1.Математика\n" + "2.Обществознание\n" + "3.Английский язык\n" + "4.Озбж\n" + "5.Русский язык\n" + "6.Английский язык";
        sendMessage2(chatId, answer);
    }

    public void Table6_4(long chatId, String name) throws TelegramApiException {
        String answer = "1.Математика\n" + "2.Биология\n" + "3.Физическая культура\n" + "4.Русский язык\n" + "5.История\n" + "6.Литература";
        sendMessage2(chatId, answer);
    }

    public void Table6_5(long chatId, String name) throws TelegramApiException {
        String answer = "1.Математика\n" + "2.География\n" + "3.Русский язык\n" + "4.Английский язык\n" + "5.Литература\n" + "6.ОДНКНР";
        sendMessage2(chatId, answer);
    }

    public void Table7_1(long chatId, String name) throws TelegramApiException {
        String answer = "Разговоры о важном\n" + "2.Биология\n" + "3.Математика\n" + "4.Английский язык\n" + "5.Русский язык\n" + "6.Литература\n" + "7.Физическая культура";
        sendMessage2(chatId, answer);
    }

    public void Table7_2(long chatId, String name) throws TelegramApiException {
        String answer = "1.Технология\n" + "2.Технология\n" + "3.Биология\n" + "4.Русский язык\n" + "5.Английский язык\n" + "6.Физика\n" + "7.Изо";
        sendMessage2(chatId, answer);
    }

    public void Table7_3(long chatId, String name) throws TelegramApiException {
        String answer = "1.Обществознание\n" + "2.Математика\n" + "3.Математика\n" + "4.География\n" + "5.Физическая культура\n" + "6.История";
        sendMessage2(chatId, answer);
    }

    public void Table7_4(long chatId, String name) throws TelegramApiException {
        String answer = "1.Русский язык\n" + "2.Русский язык\n" + "3.Математика\n" + "4.Физика\n" + "5.Информатика\n" + "6.Музыка";
        sendMessage2(chatId, answer);
    }

    public void Table7_5(long chatId, String name) throws TelegramApiException {
        String answer = "1.Английский язык\n" + "2.Родной язык\n" + "3.История\n" + "4.Математика\n" + "5.География\n" + "6.Математика";
        sendMessage2(chatId, answer);
    }

    public void Table8_1(long chatId, String name) throws TelegramApiException {
        String answer = "Разговоры о важном\n" + "2.Французский язык\n" + "3.Музыка\n" + "4.Русский язык\n" + "5.Математика\n" + "6.Биология\n" + "7.ОБЖ\n" + "8.Физическая культура";
        sendMessage2(chatId, answer);
    }

    public void Table8_2(long chatId, String name) throws TelegramApiException {
        String answer = "1.Химия\n" + "2.Биология\n" + "3.Математика\n" + "4.Английский язык\n" + "5.Русский язык\n" + "6.Математика";
        sendMessage2(chatId, answer);
    }

    public void Table8_3(long chatId, String name) throws TelegramApiException {
        String answer = "1.Литература\n" + "2.Родной язык\n" + "3.Русский язык\n" + "4.Физика\n" + "5.История\n" + "6.Математика\n" + "7.Английский язык";
        sendMessage2(chatId, answer);
    }

    public void Table8_4(long chatId, String name) throws TelegramApiException {
        String answer = "1.История\n" + "2.Технология\n" + "3.Химия\n" + "4.Математика\n" + "5.География\n" + "6.Информатика\n" + "7.Физическая культура";
        sendMessage2(chatId, answer);
    }

    public void Table8_5(long chatId, String name) throws TelegramApiException {
        String answer = "1.География\n" + "2.Физика\n" + "3.Литература\n" + "4.Обществознание\n" + "5.Математика\n" + "6.Английский язык";

        sendMessage2(chatId, answer);
    }

    public void Table9_1(long chatId, String name) throws TelegramApiException {
        String answer = "Разговоры о важном\n" + "2.Русский язык\n" + "3.География\n" + "4.Математика\n" + "5.Французский язык\n" + "6.Математика\n" + "7.Биология\n" + "8.Технология";

        sendMessage2(chatId, answer);
    }

    public void Table9_2(long chatId, String name) throws TelegramApiException {
        String answer = "1.русский язык\n" + "2.Математика\n" + "3.История\n" + "4.Химия\n" + "5.Физика\n" + "6.Литература\n" + "7.Физическая культура";

        sendMessage2(chatId, answer);
    }

    public void Table9_3(long chatId, String name) throws TelegramApiException {
        String answer = "1.Русский язык\n" + "2.Английский язык\n" + "3.ОБЖ\n" + "4.Математика\n" + "5.Математика\n" + "6.Обществознание\n" + "7.Родной язык";

        sendMessage2(chatId, answer);
    }

    public void Table9_4(long chatId, String name) throws TelegramApiException {
        String answer = "1.Физика\n" + "2.География\n" + "3.Литература\n" + "4.Химия\n" + "5.Физическая культура\n" + "6.Биология";

        sendMessage2(chatId, answer);
    }

    public void Table9_5(long chatId, String name) throws TelegramApiException {
        String answer = "1.Физика\n" + "2.Английский язык\n" + "3.Английский язык\n" + "4.Литература\n" + "5.Информатика\n" + "6.История\n" + "7.Математика";

        sendMessage2(chatId, answer);
    }

    public void Table10_1(long chatId, String name) throws TelegramApiException {
        String answer = "Разговоры о важном\n" + "2.География\n" + "3.Литература/Химия\n" + "5.Физика\n" + "6.Химия/Математика\n" + "7.Индивидуальный проект\n" + "8.Математика/обществознание";

        sendMessage2(chatId, answer);
    }

    public void Table10_3(long chatId, String name) throws TelegramApiException {
        String answer = "1.Английский язык\n" + "2.Речевая практика/Биология\n" + "3.Математика/Биология\n" + "4.История\n" + "5.Математика/Литература\n" + "6.Физика\n" + "Физическая культура";

        sendMessage2(chatId, answer);
    }

    public void Table10_2(long chatId, String name) throws TelegramApiException {
        String answer = "1.Русский язык\n" + "2.Английский язык\n" + "3.Английский язык\n" + "4.Литература/Биология\n" + "5.Математика/обществознание\n" + "6.Математика/Литература\n" + "7.Математика/Обществознание";

        sendMessage2(chatId, answer);
    }

    public void Table10_4(long chatId, String name) throws TelegramApiException {
        String answer = "1.Литература/Биология\n" + "2.Информатика\n" + "3.Обществознание/Математика\n" + "4.Русский язык\n" + "5.Литература/Химия\n" + "6.Обществознание/Математика\n" + "7.Обществознание";

        sendMessage2(chatId, answer);
    }

    public void Table10_5(long chatId, String name) throws TelegramApiException {
        String answer = "1.Математика\n" + "2.Биология/Математика\n" + "3.Математика\n" + "4.Черчение/Математика\n" + "5.ОБЖ\n" + "6.Физическая культура\n" + "7.История";

        sendMessage2(chatId, answer);
    }

    public void Table11_1(long chatId, String name) throws TelegramApiException {
        String answer = "Разговоры о важном\n" + "2.Физика\n" + "3.Английский язык\n" + "4.Право\n" + "5.Индивидуальный проект\n" + "6.История\n" + "7.Математика\n" + "8.Химия";

        sendMessage2(chatId, answer);
    }

    public void Table11_2(long chatId, String name) throws TelegramApiException {
        String answer = "1.Обществознание\n" + "2.Русский язык\n" + "3.Литература\n" + "4.Право\n" + "5.Литература\n" + "6.Математика\n" + "7.основы экологии";

        sendMessage2(chatId, answer);
    }

    public void Table11_3(long chatId, String name) throws TelegramApiException {
        String answer = "1.География\n" + "2.Астрономия\n" + "3.Физическая культура\n" + "4.Английский язык\n" + "5.Английский язык\n" + "6.Информатика\n" + "7.ОБЖ";

        sendMessage2(chatId, answer);
    }

    public void Table11_4(long chatId, String name) throws TelegramApiException {
        String answer = "1.Физическая культура\n" + "2.Русский язык\n" + "3.Русский язык\n" + "4.Обществознание\n" + "5.Математика\n" + "6.Литература\n" + "7.История";

        sendMessage2(chatId, answer);
    }

    public void Table11_5(long chatId, String name) throws TelegramApiException {
        String answer = "1.Физическая культура\n" + "2.Математика\n" + "3.Биология\n" + "4.Физика\n" + "5.Черчение\n" + "6.МХК";

        sendMessage2(chatId, answer);
    }

    private void sendMessage2(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Error occurred:  " + e.getMessage());
        }
    }

    private void goToTableAlarm(long chatId, String name) {
        String answer = "1.8:30-9:10\n" + "2.9:25-10:05\n" + "3.10:20-11:00\n" + "4.11:10-11:50\n" + "5.12:10-12:50\n" + "6.13:10-13:50\n" +
                "7.14:00-14:40\n" +
                "8.14:50-15:30\n" +
                "9.15:40-16:20\n" +
                "10.16:30-17:10";

        sendMessage2(chatId, answer);
    }
}
