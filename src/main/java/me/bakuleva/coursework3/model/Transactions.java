package me.bakuleva.coursework3.model;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Tag(name = "транзакции", description = "Все транзакции")
    public class Transactions {
        @NonNull
        @Schema(description = "Тип транзакции", anyOf = TypeOfTransaction.class)
        private TypeOfTransaction type;
        @NonNull
        @Schema(description = "дата, фиксируется автоматически", implementation = LocalDate.class)
        private String localDate;
        @NonNull
        @Schema(description = "Количество носков", minimum = "0")
        private int quantity;

        @NonNull
        @Schema(description = "Размер носков")
        private Size size;

        @NonNull
        @Schema(description = "Процентное содержание хлопка", minimum = "0", maximum = "100", format = "000")
        private int cottonPercentage;

        @NonNull
        @Schema(description = "Цвет носков", anyOf = Color.class)
        private Color color;

        public Transactions(TypeOfTransaction type, int quantity, Size size, int composition, Color color) {
            this.type = type;
            this.localDate = LocalDate.now().getDayOfMonth() + ":"
                    + LocalDate.now().getMonth() + ":"
                    + LocalDate.now().getYear();
            this.quantity = quantity;
            this.size = size;
            this.cottonPercentage = composition;
            this.color = color;
        }
    }


