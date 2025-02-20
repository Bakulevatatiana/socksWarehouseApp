package me.bakuleva.coursework3.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotNull;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sock {
    @NonNull
    @Schema(description = "Цвет носков")
    private Color color;
    @NonNull
    @Schema(description = "Размер носков")
    private Size size;
    @NotNull
    @Schema(description = "Хлопка в составе носков")
    private int cottonPercentage;
    @Schema(description = "Количество пар носков")
    private int quantity;


    public Sock(Color color, Size size, int cottonPercentage) {
        this.color = color;
        this.size = size;
        this.cottonPercentage = cottonPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sock sock = (Sock) o;
        return cottonPercentage == sock.cottonPercentage && quantity == sock.quantity && color == sock.color && size == sock.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size, cottonPercentage, quantity);
    }
}

