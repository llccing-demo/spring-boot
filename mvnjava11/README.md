## Maven command
mvn spring-boot:run


## vscode development
install java plugins, then choose xxxApplicatoin.java run java.


## practise

https://snailclimb.gitee.io/springboot-guide/#/?id=%e9%87%8d%e8%a6%81%e7%9f%a5%e8%af%86%e7%82%b9

## start java with docker
### Dockerfile
```dockerfile
FROM openjdk:11-jre-slim-buster
```

### docker change mirror

```shell
systemctl cat docker | grep '\-\-registry\-mirror'

sudo touch /etc/docker/daemon.json

{
  "registry-mirrors": [
    "https://hub-mirror.c.163.com",
    "https://mirror.baidubce.com"
  ]
}
```

https://yeasy.gitbook.io/docker_practice/install/mirror

### update pom.xml

```xml
<plugin>
  <groupId>com.spotify</groupId>
  <artifactId>dockerfile-maven-plugin</artifactId>
  <version>${dockerfile-version}</version>
  <configuration>
    <repository>${project.build.finalName}</repository>
    <tag>${project.version}</tag>
    <buildArgs>
      <JAR_FILE>target/${project.build.finalName}.jar</JAR_FILE>
    </buildArgs>
  </configuration>
  <executions>
    <execution>
      <id>default</id>
      <phase>package</phase>
      <goals>
        <goal>build</goal>
      </goals>
    </execution>
  </executions>
</plugin>
```

remember add  `<finalName>demo-docker</finalName>` and `<dockerfile-version>1.4.9</dockerfile-version>`

### build docker images

```shell
mvn clean package -Dmaven.test.skip=true
```

### run
```shell
docker run -d -p 8080:8080 demo-docker:1.0.0-SNAPSHOT
```

### docker command
https://linuxize.com/post/how-to-remove-docker-images-containers-volumes-and-networks/