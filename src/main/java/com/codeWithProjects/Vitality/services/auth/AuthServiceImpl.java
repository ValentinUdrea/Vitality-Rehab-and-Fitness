package com.codeWithProjects.Vitality.services.auth;

import com.codeWithProjects.Vitality.dto.SignupRequest;
import com.codeWithProjects.Vitality.dto.UserDto;
import com.codeWithProjects.Vitality.entity.Order;
import com.codeWithProjects.Vitality.entity.User;
import com.codeWithProjects.Vitality.enums.OrderStatus;
import com.codeWithProjects.Vitality.enums.UserRole;
import com.codeWithProjects.Vitality.repository.OrderRepository;
import com.codeWithProjects.Vitality.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private OrderRepository orderRepository;

    public UserDto createUser(SignupRequest signupRequest){
        User user = new User();

        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setRole(UserRole.CUSTOMER);
        User createdUser = userRepository.save(user);

        //Whenever we are creating a new user automatically a new cart will be created with tha status of pending
        Order order = new Order();
        order.setAmount(0L);
        order.setTotalAmount(0L);
        order.setDiscount(0L);
        order.setUser(createdUser);
        order.setOrderStatus(OrderStatus.Pending); //so we can add items in this cart
        orderRepository.save(order);





        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());

        return userDto;


    }

    public Boolean hasUserWithEmail(String email){
        return userRepository.findFirstByEmail(email).isPresent();
    }

    @PostConstruct
    public void createAdminAccount(){
        User adminAccount = userRepository.findByRole(UserRole.ADMIN);
        if(null == adminAccount){
            User user = new User();
            user.setEmail("admin@admin.com");
            user.setName("admin");
            user.setRole(UserRole.ADMIN);
            user.setPassword(new BCryptPasswordEncoder().encode("adminpoli"));
            userRepository.save(user);
        }
    }//creates admin account
}
