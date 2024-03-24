FROM eclipse-temurin:21-jdk-alpine AS base
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src


FROM base AS build
RUN ./mvnw package -DskipTests


FROM eclipse-temurin:21-jre-alpine AS production
EXPOSE 8080
COPY --from=build /app/target/muzayede-backend-*.jar /muzayede.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/muzayede.jar"]