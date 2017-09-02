# Resume

## How to Run

```shell
# 修改application-local.properties 数据源配置
spring.datasource.url=jdbc:mysql://localhost:3306/resume?characterEncoding=utf-8
spring.datasource.username=root
spring.datasource.password=...

# 启动类main方法
com.smartbean.PlatformHRApplication#main

# 打包(修改Platform-HR/pom.xml，放开注释)
mvn clean package

```