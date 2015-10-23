FROM        balamaci/oracle-jdk8
ENV MAVEN_VERSION 3.3.3
ENV M2_HOME /opt/maven

# Get and Unpack maven
RUN wget http://mirrors.ibiblio.org/apache/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz -O - | tar -xz && mv apache-maven-$MAVEN_VERSION $M2_HOME
RUN ln -s $M2_HOME/bin/mvn /usr/bin/mvn

