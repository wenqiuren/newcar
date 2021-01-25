package com.online.taxi.mapper;

import com.online.taxi.entity.OrderRulePrice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 *
 * @date 2018/8/25
 */
@Service
public interface OrderRulePriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order_rule_price
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order_rule_price
     *
     * @mbggenerated
     */
    int insert(OrderRulePrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order_rule_price
     *
     * @mbggenerated
     */
    int insertSelective(OrderRulePrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order_rule_price
     *
     * @mbggenerated
     */
    OrderRulePrice selectByPrimaryKey(@Param("orderId") Integer id, @Param("category") Integer category);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order_rule_price
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OrderRulePrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order_rule_price
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderRulePrice record);
}
