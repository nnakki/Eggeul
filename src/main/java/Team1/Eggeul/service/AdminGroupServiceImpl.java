package Team1.Eggeul.service;

import Team1.Eggeul.domain.AdminGroupCriteria;
import Team1.Eggeul.domain.AdminGroupPageDTO;
import Team1.Eggeul.mapper.AdminGroupMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Log4j
@Service
@AllArgsConstructor
public class AdminGroupServiceImpl implements AdminGroupService{

    private AdminGroupMapper mapper;


    @Override
    public AdminGroupPageDTO adminGetGroupListWithPagingBySn(AdminGroupCriteria cri) {

        log.info("get adminGroup cri : " + cri);
        return new AdminGroupPageDTO(
                mapper.adminGetCountBySn(cri),
                mapper.adminGetGroupListWithPagingBySn(cri)
        );
    }

    @Override
    public int adminGroupRemove(Long sn) {

        return mapper.adminGroupRemove(sn);
    }
}
