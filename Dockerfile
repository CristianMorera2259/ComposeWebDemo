FROM eclipse-temurin:25-jdk AS build
RUN apt-get update && apt-get install -y --no-install-recommends libatomic1 && rm -rf /var/lib/apt/lists/*
WORKDIR /app
COPY . .
RUN sed -i 's/\r$//' gradlew && chmod +x gradlew && ./gradlew :webApp:wasmJsBrowserDistribution --no-daemon

FROM nginx:alpine
COPY --from=build /app/webApp/build/dist/wasmJs/productionExecutable /usr/share/nginx/html
EXPOSE 80