package org.javaschoolbot.schoolivnyabot.KeyBoard;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

@Component
public class KeyBoard {
    public ReplyKeyboardMarkup createKeyboard() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        row1.add(new KeyboardButton("расписание\uD83D\uDCDA"));
        row2.add(new KeyboardButton("сайт школы\uD83D\uDCBB"));
        row2.add(new KeyboardButton("вк\uD83D\uDCF1"));
        row2.add(new KeyboardButton("Телеграмм☎\uFE0F"));


        keyboard.add(row1);
        keyboard.add(row2);

        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup createKeyboardStart() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();

        row1.add(new KeyboardButton("Посмотреть расписание\uD83D\uDCDA"));
        row2.add(new KeyboardButton("Перейти на главный сайт школы\uD83D\uDCBB"));
        row3.add(new KeyboardButton("Перейти на сайт школы в вк \uD83D\uDCF1"));


        keyboard.add(row1);
        keyboard.add(row2);
        keyboard.add(row3);

        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup createKeyboard2() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        row1.add(new KeyboardButton("Расписание для учеников\uD83D\uDC69\u200D\uD83C\uDF93\uD83D\uDC68\u200D\uD83C\uDF93"));
        row2.add(new KeyboardButton("Расписание звонков\uD83D\uDD14"));
        row2.add(new KeyboardButton("В главное меню\uD83D\uDD19"));

        keyboard.add(row1);
        keyboard.add(row2);

        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup createKeyboard3() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Назад\uD83D\uDD19"));

        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup createKeyboardClasses() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("5"));
        row.add(new KeyboardButton("6"));
        row.add(new KeyboardButton("7"));
        row.add(new KeyboardButton("8"));
        row.add(new KeyboardButton("9"));
        row.add(new KeyboardButton("10"));
        row.add(new KeyboardButton("11"));
        row.add(new KeyboardButton("назад◀\uFE0F"));

        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup createKeyboardDayClassesNumber5() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Понедельник"));
        row.add(new KeyboardButton("Вторник"));
        row.add(new KeyboardButton("Среда"));
        row.add(new KeyboardButton("Четверг"));
        row.add(new KeyboardButton("Пятница"));
        row.add(new KeyboardButton("Назад"));


        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup createKeyboardDayClassesNumber6() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Понедельник"));
        row.add(new KeyboardButton("Вторник"));
        row.add(new KeyboardButton("Среда"));
        row.add(new KeyboardButton("Четверг"));
        row.add(new KeyboardButton("Пятница"));
        row.add(new KeyboardButton("Назад"));


        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup createKeyboardDayClassesNumber7() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Понедельник"));
        row.add(new KeyboardButton("Вторник"));
        row.add(new KeyboardButton("Среда"));
        row.add(new KeyboardButton("Четверг"));
        row.add(new KeyboardButton("Пятница"));
        row.add(new KeyboardButton("Назад"));

        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup createKeyboardDayClassesNumber8() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Понедельник"));
        row.add(new KeyboardButton("Вторник"));
        row.add(new KeyboardButton("Среда"));
        row.add(new KeyboardButton("Четверг"));
        row.add(new KeyboardButton("Пятница"));
        row.add(new KeyboardButton("Назад"));


        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup createKeyboardDayClassesNumber9() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Понедельник"));
        row.add(new KeyboardButton("Вторник"));
        row.add(new KeyboardButton("Среда"));
        row.add(new KeyboardButton("Четверг"));
        row.add(new KeyboardButton("Пятница"));
        row.add(new KeyboardButton("Назад"));


        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup createKeyboardDayClassesNumber10() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Понедельник"));
        row.add(new KeyboardButton("Вторник"));
        row.add(new KeyboardButton("Среда"));
        row.add(new KeyboardButton("Четверг"));
        row.add(new KeyboardButton("Пятница"));
        row.add(new KeyboardButton("Назад"));


        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup createKeyboardDayClassesNumber11() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Понедельник"));
        row.add(new KeyboardButton("Вторник"));
        row.add(new KeyboardButton("Среда"));
        row.add(new KeyboardButton("Четверг"));
        row.add(new KeyboardButton("Пятница"));
        row.add(new KeyboardButton("Назад"));

        keyboard.add(row);
        replyKeyboardMarkup.setKeyboard(keyboard);

        return replyKeyboardMarkup;
    }

}


