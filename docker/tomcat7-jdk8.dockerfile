FROM        maven:3.3.3-jdk-8
ENV TOMCAT_VERSION 7.0.63

VOLUME      ["/var/log/tomcat7"]

# Get and Unpack Tomcat
RUN wget http://archive.apache.org/dist/tomcat/tomcat-7/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz -O /tmp/catalina.tar.gz && \
            tar xzf /tmp/catalina.tar.gz -C /opt && \
            ln -s /opt/apache-tomcat-${TOMCAT_VERSION}/ /opt/tomcat && \
            rm /tmp/catalina.tar.gz

ADD tomcat-users.xml /opt/tomcat/conf/
CMD CATALINA_BASE=/opt/tomcat CATALINA_HOME=/opt/tomcat /opt/tomcat/bin/catalina.sh run
EXPOSE 8080