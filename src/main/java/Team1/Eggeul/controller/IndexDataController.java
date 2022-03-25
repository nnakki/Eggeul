package Team1.Eggeul.controller;

import Team1.Eggeul.domain.CodeTable;
import Team1.Eggeul.domain.GroupCriteria;
import Team1.Eggeul.domain.GroupVO;
import Team1.Eggeul.domain.StudyVO;
import Team1.Eggeul.mapper.IndexDataMapper;
import Team1.Eggeul.service.IndexDataService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@Log4j
@AllArgsConstructor
public class IndexDataController {

    IndexDataService service;
    IndexDataMapper mapper;


    @GetMapping(value = "/getPopularGroupList",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<List<GroupVO>> getPopularGroupList(GroupCriteria cri){
        List<GroupVO> list = service.popularGroupList(cri);
        list.forEach(group -> {
            group.setSigungu(CodeTable.valueOf(group.getSigungu()).getValue());
        });
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // 인기있는 스터디
    @GetMapping(value = "/getPopularStudyList",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<List<StudyVO>> getPopularStudyList(GroupCriteria cri){
        return new ResponseEntity<>(service.popularStudyList(cri), HttpStatus.OK);
    }
    

}
