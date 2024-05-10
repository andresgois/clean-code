java -jar -Dspring.profiles.active=dev app.jar
spring.profiles.active=dev

```
{
    "configurations": [

        {
            "type": "java",
            "name": "Forum APP",
            "request": "launch",
            "cwd": "${workspaceFolder}",
            "console": "internalConsole",
            "mainClass": "br.com.alura.forum.ForumApplication",
            "projectName": "Forum",
            "args": "",
            "env": {
                "SPRING_PROFILES_ACTIVE": "DEV"
                 }
        }
    ]
}
```