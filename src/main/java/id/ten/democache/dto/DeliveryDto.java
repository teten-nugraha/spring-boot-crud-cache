package id.ten.democache.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import id.ten.democache.util.CustomDateAndTimeDeserialize;
import lombok.Data;

import java.util.Date;

@Data
public class DeliveryDto {
    private Long id;
    //pickup
    private String pickupName;
    private String pickupAddress;
    @JsonDeserialize(using= CustomDateAndTimeDeserialize.class)
    private Date pickupDateTime;
    private String[] pickupContactNumbers;
    private String pickupComment;
    //drop
    private String dropName;
    private String dropAddress;
    private String[] dropContactNumbers;
    private String dropComment;
}
