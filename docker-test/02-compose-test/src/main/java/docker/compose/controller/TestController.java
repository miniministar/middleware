package docker.compose.controller;

import docker.compose.entity.UserEntity;
import docker.compose.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final UserRepository userRepository;

    @Autowired
    private RedisTemplate redisTemplate;

    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("getUserInfo")
    public String getUserInfo(String name){
        UserEntity userEntity = userRepository.findByName(name);
        return userEntity.toString();
    }

    @GetMapping("setRedis")
    public String setRedis(String key,String val){
        redisTemplate.opsForValue().set(key,val);
        return "成功";
    }

    @GetMapping("getRedisName")
    public Object getRedisName(String key){
        Object o = redisTemplate.opsForValue().get(key);
        return o;
    }
}