package com.company;

import com.company.controller.CardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@SpringBootTest
class SpringRestExampleApplicationTests {
/*//    @Autowired
//    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:9090/card/test/str", String.class);
        System.out.println(result);
    }

    @Test
    void getCardByNumber() {
        // 123123128
        RestTemplate restTemplate = new RestTemplate();
        CardDTO result = restTemplate.getForObject("http://localhost:9090/card/number/123123128",
                CardDTO.class);
        System.out.println(result);
    }

    @Test
    void requestParamTest() {
        // 123123128
        int pegajon = 1;
        int s = 10;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:9090/card/test/" +
                "param?size={s}&page={p}", String.class, s, pegajon);
        System.out.println(result);
    }


    @Test
    void getCardByNumber_2() {
        // 123123128
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CardDTO> result = restTemplate.getForEntity("http://localhost:9090/card/number/123123128",
                CardDTO.class);

        System.out.println(result.getBody());
        System.out.println(result.getStatusCode());
        System.out.println(result.getStatusCodeValue());
        System.out.println(result.getHeaders());
    }

    @Test
    void create_card() {
        // 123123128
        CardDTO dto = new CardDTO();
        dto.setExpDate("12/12");
        dto.setProfileId(1L);
        dto.setNumber("1233545745");

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.postForObject("http://localhost:9090/card/",
                dto,
                String.class);

        System.out.println(result);
    }

    @Test
    void create_card2() {
        // 123123128
        CardDTO dto = new CardDTO();
        dto.setExpDate("12/12");
        dto.setProfileId(1L);
        dto.setNumber("1233545745");

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CardDTO> result = restTemplate.postForEntity("http://localhost:9090/card/",
                dto,
                CardDTO.class);

        System.out.println(result.getBody());
    }

    @Test
    void update_card() {
        // 123123128
        CardDTO dto = new CardDTO();
        dto.setExpDate("12/12");
        dto.setProfileId(1L);
        dto.setNumber("1233545745");

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put("http://localhost:9090/card/19", dto);
    }

    @Test
    void delete_card() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete("http://localhost:9090/card/19");
    }

    @Test
    void header_test() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> result = restTemplate.exchange("http://localhost:9090/card/test/header",
                HttpMethod.GET,
                entity,
                String.class);

        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());
    }

    @Test
    void requestParamTest2() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        int pegajon = 1;
        int s = 10;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> result = restTemplate.exchange("http://localhost:9090/card/test/" +
                        "param?size={s}&page={p}",
                HttpMethod.GET,
                entity,
                String.class, s, pegajon);
        System.out.println(result);
    }


    @Test
    void header_test_post() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        CardDTO dto = new CardDTO();
        dto.setExpDate("12/12");
        dto.setProfileId(1L);
        dto.setNumber("12335457453");

        HttpEntity<CardDTO> entity = new HttpEntity<>(dto, headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> result = restTemplate.exchange("http://localhost:9090/card/",
                HttpMethod.POST,
                entity,
                String.class);

        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());
    }


    @Test
    void getList() {
        // 123123128
        ParameterizedTypeReference<List<CardDTO>> returnType =
                new ParameterizedTypeReference<List<CardDTO>>() {
                };

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<CardDTO> entity = new HttpEntity<>(headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<CardDTO>> result = restTemplate.exchange("http://localhost:9090/card/",
                HttpMethod.GET,
                entity,
                returnType);
        System.out.println(result);
    }*/
}
