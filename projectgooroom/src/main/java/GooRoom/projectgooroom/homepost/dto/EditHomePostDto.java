package GooRoom.projectgooroom.homepost.dto;

import GooRoom.projectgooroom.global.embedded.Address;
import GooRoom.projectgooroom.homepost.domain.PostStatus;
import GooRoom.projectgooroom.homepost.domain.RentType;

public record EditHomePostDto(
        String title,
        PostStatus postStatus,
        RentType rentType,
        int roomPrice,
        String city,
        String roadName,
        String buildingNumber,
        String zipcode,
        String content)
{

}
