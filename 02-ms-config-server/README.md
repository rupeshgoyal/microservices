# Config Server

## JCE
* JCE jars are not require for Java 9 and 9+ version

## Encryption URL
    http://localhost:8010/encrypt
* This is a post Method 
* Add value in body as *__raw__* type and as *__text__* format
* Add Basic Authentication  
    username: root  
    password: s3cr3t  
* Output will be encrypted value.
    
    
---

## Decryption URL
    http://localhost:8010/decrypt
* This is a post Method 
* Add encrypted value in body as *__raw__* type and as *__text__* format
* Add Basic Authentication  
    username: root  
    password: s3cr3t
 * Output will be decrypted value.  
 
## Fetch properties from server
    http://localhost:8010/spring-cloud-gateway/default/
* This is a get Method 
* Add Basic Authentication  
    username: root  
    password: s3cr3t