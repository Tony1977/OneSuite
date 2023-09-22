FROM openjdk:8-jdk-alpine
MAINTAINER Tarun Bounthiyal <tarunbounthiyal@gmail.com>

ENV APP_HOME /app

#RUN groupadd -r app && useradd -r -gapp app
#RUN mkdir -m 0755 -p ${APP_HOME}/bin
#RUN mkdir -m 0755 -p ${APP_HOME}/config
#RUN mkdir -m 0755 -p ${APP_HOME}/logs/

COPY target/UserManagement-0.0.1.jar ${APP_HOME}/bin
COPY docker-entrypoint.sh /

RUN chown -R app:app ${APP_HOME}
#RUN ["chmod", "+x", "/entrypoint.sh"]

EXPOSE 8080
EXPOSE 8443

WORKDIR ${APP_HOME}
CMD ["/docker-entrypoint.sh"]
