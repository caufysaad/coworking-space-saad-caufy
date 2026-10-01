package ma.caufysaad.coworking.dto.request;

import ma.caufysaad.coworking.model.DeskStatus;
import ma.caufysaad.coworking.model.DeskType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DeskRequest {
    @NotBlank
    private String deskNumber;

    @NotNull
    private DeskType deskType;

    private DeskStatus availabilityStatus;
}
