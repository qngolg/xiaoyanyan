# 初始化Spock
##Spock Maven 工程导入

###引入maven依赖 groovy-all 和 spock-core
```xml
<!-- spock 引入 -->
<dependencies>
    <dependency>
        <groupId>org.spockframework</groupId>
        <artifactId>spock-core</artifactId>
        <version>1.2-groovy-2.4</version>
        <scope>test</scope>
    </dependency>
    
    <!-- groovy-all -->
    <dependency> 
        <groupId>org.codehaus.groovy</groupId>
        <artifactId>groovy-all</artifactId>
        <version>2.4.15</version>
    </dependency>
</dependencies>
```

###引入 gmaven-plugin 插件，用于写groovy文件
```xml
<plugin>
    <groupId>org.codehaus.groovy.maven</groupId>
    <artifactId>gmaven-plugin</artifactId>
    <executions>
        <execution>
            <goals>
                <goal>compile</goal>
            </goals>
            <configuration>
                <sources>
                    <fileset>
                        <directory>${pom.basedir}/src/test/groovy</directory>
                        <includes>
                            <include>**/*.groovy</include>
                        </includes>
                    </fileset>
                </sources>
            </configuration>
        </execution>
    </executions>
</plugin>
```

### spock特性分析
```text
setup 用于每个test之前运行一次，在given之前运行，
setupSpec 在单个test或全部test运行时，只在最开始执行一次
cleanup 在每个test运行之后运行一次，在then之后git remote add origin https://github.com/qngolg/mysql--.git
cleanupSpec 在单个test或多个test运行时，只在最末尾执行一次
```




