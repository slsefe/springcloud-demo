# SpringCloudDemo

## docker 启动nacos

```bash
docker run --name nacos-standalone-derby \
    -e MODE=standalone \
    -e NACOS_AUTH_TOKEN=k3V8fLq2xY9mRnTpQwZsAeUbGhJcNvXyIoP7rD5tEaM= \
    -e NACOS_AUTH_IDENTITY_KEY=nacos \
    -e NACOS_AUTH_IDENTITY_VALUE=nacos \
    -p 8080:8080 \
    -p 8848:8848 \
    -p 9848:9848 \
    -d nacos/nacos-server:latest
```

nacos控制台：http://127.0.0.1:8080/index.html