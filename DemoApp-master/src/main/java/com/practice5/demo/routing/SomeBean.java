package com.practice5.demo.routing;
import com.practice5.demo.domain.Person;
import com.practice5.demo.domain.Phone;
import com.practice5.demo.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class SomeBean {

        @Autowired
//    private PersonRepository repository;
        private PhoneRepository phoneRepository;
        public  void putData(){
            List<Phone> phones= phoneRepository.findAll();
            for (Phone phone:phones){
                System.out.println(phone.getPersons());
            }
//        Person personL=new Person();
//        personL.setName("L");
//        personL.setAge(19);
//        phoneRepository.save(personL);
//
//        Person personKira=new Person();
//        personKira.setName("Kira");
//        personKira.setAge(19);
//        phoneRepository.save(personKira);
    }
}
