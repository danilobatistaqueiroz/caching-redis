# Spring-Boot using cache with Redis

its necessery to use the startes:  
spring-boot-starter-cache  
spring-boot-starter-data-redis  

in application.properties:  
spring.cache.type=redis  
spring.redis.host=localhost  
spring.redis.port=6379  


start a docker container:  
`docker run -it --name redis -p 6379:6379 redis:5.0.3`  

to edit, remove a cache, add, etc:  
`docker exec -it redis /bin/bash` 

`# redis-cli`  

`127.0.0.1:6379> KEYS *`  

`127.0.0.1:6379> get "hello::SimpleKey []"`  

`127.0.0.1:6379> del "hello::SimpleKey []"`  

`127.0.0.1:6379> set "hello::SimpleKey []" "  "`  
