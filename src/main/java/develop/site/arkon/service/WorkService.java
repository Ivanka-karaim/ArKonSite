package develop.site.arkon.service;

import develop.site.arkon.data.WorkRepository;
import develop.site.arkon.dto.WorkDTO;
import develop.site.arkon.model.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import develop.site.arkon.model.WorkPhoto;

@Service
public class WorkService {

    @Autowired
    private WorkRepository workRepository;

    public List<WorkDTO> getWorksForGeneralPage() {
        List<Work> works =  workRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "date")));
        return parsingWorksDTO(works);
    }

    private WorkDTO parsingWorkDTO(Work work) {
        return WorkDTO.builder()
                .id(work.getId())
                .name(work.getName())
                .date(work.getDate())
                .description(work.getDescription())
                .price(work.getPrice())
                .product_name(work.getProduct().getName())
                .product_id(work.getProduct().getId())
                .photos(work.getWorkPhotos().stream()
                        .map(WorkPhoto::getPhoto)
                        .collect(Collectors.toList())).build();


    }

    private List<WorkDTO> parsingWorksDTO(List<Work> works) {
        List<WorkDTO> workDTOS = new ArrayList<>();
        for (Work work : works) {
            workDTOS.add(WorkDTO.builder()
                    .id(work.getId())
                    .name(work.getName())
                    .date(work.getDate())
                    .description(work.getDescription())
                    .price(work.getPrice())
                    .product_name(work.getProduct().getName())
                    .product_id(work.getProduct().getId())
                    .photos(work.getWorkPhotos().stream()
                            .map(WorkPhoto::getPhoto)
                            .collect(Collectors.toList())).build());



        }
        return workDTOS;
    }
}
