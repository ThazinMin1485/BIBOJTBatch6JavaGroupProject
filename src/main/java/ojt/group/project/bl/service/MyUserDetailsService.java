package ojt.group.project.bl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ojt.group.project.bl.dto.CustomerDto;


/**
 * <h2> MyUserDetailsService Class</h2>
 * <p>
 * Process for Displaying MyUserDetailsService
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Service("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService{
    
    /**
     * <h2> customerService</h2>
     * <p>
     * customerService
     * </p>
     */
    @Autowired
    private CustomerService customerService;
    
    /**
     * <h2> loadUserByUsername </h2>
     * <p>
     * 
     * </p>
     * 
     * @param email
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        CustomerDto customerDto = customerService.findByEmail(email);

        if (customerDto == null) {
            throw new UsernameNotFoundException("Customer not found");
        }

        System.out.println("---customer found----");
        System.out.println("---customer found----" + customerDto.getEmail());
        System.out.println("---customer found----" + customerDto.getPassword());
        System.out.println("---customer found----"+customerDto.getType());

        UserDetails user = new User(customerDto.getEmail(), customerDto.getPassword(), authorities(customerDto.getType()));
        return user;
    }

    /**
     *<h2>authorities
     *<p>
     *
     *</p>
     *
     * @param type
     * @return
     *@return List<GrantedAuthority>
     */
    private List<GrantedAuthority> authorities(String type) {
        List<GrantedAuthority> setAuths = new ArrayList<GrantedAuthority>();

        if (Integer.parseInt(type) == 0) {
            setAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        } else if (Integer.parseInt(type) == 1) {
            setAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }

        return setAuths;
    }
}
