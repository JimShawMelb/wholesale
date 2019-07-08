FROM maven:3.6.1-jdk-11-slim
WORKDIR /app
RUN apt-get -y update \
    && apt-get -y install git \
    && rm -rf /var/lib/apt/lists/*
RUN git clone https://github.com/JimShawMelb/wholesale.git
WORKDIR /app/wholesale
RUN mvn install
EXPOSE 8080
CMD [ "java", "-jar", "target/wholesale-0.0.1-SNAPSHOT.jar" ]
