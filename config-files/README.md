POSTMAN URL:
############Config Server####################
1.	Get:  	http://localhost:8010/api-gateway/default/
2.	Post: 	http://localhost:8010/encrypt
				Body: anyPassword
				Authorization -> Basic Auth -> 	username = root
												Password = s3cr3t
3.	Post: 	http://localhost:8010/actuator/bus-refresh
				Body: None
				Authorization -> Basic Auth -> 	username = root
												Password = s3cr3t

################API Gateway#####################
1.	Get:	http://localhost:8012/actuator/routes
				Body: None
				Authorization -> Basic Auth -> 	username = root
												Password = s3cr3t
2.	Post:	http://localhost:8012/user-service/users
				Body:	{
							"firstName":"1",
							"lastName":"Goyal",
							"email":"rupeshgoyal@gmail.com",
							"password":"password123"
						}
3.	Post:	http://localhost:8012/user-service/users/login
				Body: 	{
							"email":"rupeshgoyal@gmail.com",
							"password":"password123"
						}
4.	Get:	http://localhost:8012/user-service/users/check/status
				Body: None
				Authorization: Bearer Token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIwNmZkNjQ0Ni1hZGMyLTRiMWYtOTllYi02NzRiNmJmNjNhYjYiLCJhdXRob3JpdGllcyI6W10sImlhdCI6MTU4Njc5NDAyMiwiZXhwIjoxNTg2ODgwNDIyfQ.oVc2J0ldQVjCD2g8rhuPETgl4UnwVRSR7912WnRDangIs17w-1X8b7dhWsHX81Za1WDx8zGjIhf1Faaxvvc05w
5.	Get:	http://localhost:8012/user-service/users/b908fb91-d06d-4999-b45d-c8c622808b1b
				Body: None
				Authorization: Bearer Token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIwNmZkNjQ0Ni1hZGMyLTRiMWYtOTllYi02NzRiNmJmNjNhYjYiLCJhdXRob3JpdGllcyI6W10sImlhdCI6MTU4Njc5NDAyMiwiZXhwIjoxNTg2ODgwNDIyfQ.oVc2J0ldQVjCD2g8rhuPETgl4UnwVRSR7912WnRDangIs17w-1X8b7dhWsHX81Za1WDx8zGjIhf1Faaxvvc05w
6.	Get:	http://localhost:8012/album-service/users/b908fb91-d06d-4999-b45d-c8c622808b1b/albums/
				Body: None
				Authorization: Bearer Token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIwNmZkNjQ0Ni1hZGMyLTRiMWYtOTllYi02NzRiNmJmNjNhYjYiLCJhdXRob3JpdGllcyI6W10sImlhdCI6MTU4Njc5NDAyMiwiZXhwIjoxNTg2ODgwNDIyfQ.oVc2J0ldQVjCD2g8rhuPETgl4UnwVRSR7912WnRDangIs17w-1X8b7dhWsHX81Za1WDx8zGjIhf1Faaxvvc05w
7. 	Post: 	http://localhost:8012/album-service/albums/
				Body:	{
							"name":"Album6",
							"title":"title6",
							"userId":"06fd6446-adc2-4b1f-99eb-674b6bf63ab6"
						}
				Authorization: Bearer Token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIwNmZkNjQ0Ni1hZGMyLTRiMWYtOTllYi02NzRiNmJmNjNhYjYiLCJhdXRob3JpdGllcyI6W10sImlhdCI6MTU4Njc5NDAyMiwiZXhwIjoxNTg2ODgwNDIyfQ.oVc2J0ldQVjCD2g8rhuPETgl4UnwVRSR7912WnRDangIs17w-1X8b7dhWsHX81Za1WDx8zGjIhf1Faaxvvc05w
Browsers:
1.
2.	http://localhost:8011/		username = eurekaUser and password = eurekaPassword
3.	http://localhost:15672/#/connections  username = guest and password = guest
4.	http://localhost:9411/zipkin/
5.	http://localhost:8012/user-service/browser/index.html#/