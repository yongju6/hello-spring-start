package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
@RequiredArgsConstructor
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }


//    @Bean
//    public MemberRepository memberRepository(){
//
//       return new MemoryMemberRepository();
//       return new JpaMemberRepository(em);
//    }
}
