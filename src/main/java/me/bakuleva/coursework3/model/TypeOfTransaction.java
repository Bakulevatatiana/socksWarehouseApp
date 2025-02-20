package me.bakuleva.coursework3.model;

import lombok.Getter;

@Getter
public enum TypeOfTransaction {

        ADD("Приёмка"),
        PICK_UP("Выдача"),
        DELETE("Списание");

        private final String name;

        TypeOfTransaction(String name) {
            this.name = name;
        }

    public TypeOfTransaction getByName(String s) {
            return TypeOfTransaction.valueOf(s);
        }
    }

