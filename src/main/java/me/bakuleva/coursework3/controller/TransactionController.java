package me.bakuleva.coursework3.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import me.bakuleva.coursework3.model.Transactions;
import me.bakuleva.coursework3.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/transaction")
@Tag(name = "Все транзакции")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping()
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Транзакции успешно получены",
                            content = {
                                    @Content(
                                            mediaType = "application/json",
                                            array = @ArraySchema(schema = @Schema(implementation = Transactions.class))
                                    )
                            }
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Ответ отсутствует"
                    )
            }

    )
    public ResponseEntity<Collection<Transactions>> getAllTransactions() {
        if (!transactionService.getAllTransactions().isEmpty()) {
            return ResponseEntity.ok(transactionService.getAllTransactions());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

