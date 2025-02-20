package me.bakuleva.coursework3.model;

public enum Color {
    RED("Красный"),
    WHITE("Белый"),
    BLACK("Черный"),
    BLUE("Синий"),
    GREEN("Зеленый"),
    YELLOW("Желтый");


    private final String text;

    Color(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
