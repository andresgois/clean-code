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

- https://marcionizzola.medium.com/esque%C3%A7a-o-postman-use-o-vscode-para-testar-api-s-2b98c004b750
- http://localhost:8080/h2-console
- teste merge