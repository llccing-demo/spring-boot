# 基础镜像
FROM openjdk:11-jre-slim-buster

# 作者信息
LABEL author="lcf33123@gmail.com"

# 添加一个存储空间
VOLUME [ "/tmp" ]

# 暴露8080端口
EXPOSE 8080

# 添加变量，如果使用 dockerfile-maven-plugin, 则会自动替换这里的变量内容
ARG JAR_FILE=target/mvnjava11-0.0.1-SNAPSHOT.jar

#  往容器里添加 jar 包
ADD ${JAR_FILE} app.jar

# 启动镜像自动运行程序
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "/app.jar"]