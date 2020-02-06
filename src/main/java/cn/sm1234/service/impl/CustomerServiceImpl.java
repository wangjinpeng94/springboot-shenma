package cn.sm1234.service.impl;

import cn.sm1234.dao.CustomerMapper;
import cn.sm1234.domain.Customer;
import cn.sm1234.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl  implements CustomerService {
    //注入mapper接口的对象
    private CustomerMapper customerMapper;
    @Override
    public void save(Customer customer) {
        System.out.println("impl name："+customer.getName());
        customerMapper.save(customer);
    }
}
