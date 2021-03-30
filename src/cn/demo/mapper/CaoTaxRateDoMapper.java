package cn.demo.mapper;

import com.mall.vo.branch.CaoTaxRateDo;
import com.mall.vo.branch.CaoTaxRateDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaoTaxRateDoMapper {
    int countByExample(CaoTaxRateDoExample example);

    int deleteByExample(CaoTaxRateDoExample example);

    int deleteByPrimaryKey(Long taxRateId);

    int insert(CaoTaxRateDo record);

    int insertSelective(CaoTaxRateDo record);

    List<CaoTaxRateDo> selectByExample(CaoTaxRateDoExample example);

    CaoTaxRateDo selectByPrimaryKey(Long taxRateId);

    int updateByExampleSelective(@Param("record") CaoTaxRateDo record, @Param("example") CaoTaxRateDoExample example);

    int updateByExample(@Param("record") CaoTaxRateDo record, @Param("example") CaoTaxRateDoExample example);

    int updateByPrimaryKeySelective(CaoTaxRateDo record);

    int updateByPrimaryKey(CaoTaxRateDo record);
}