FROM bellsoft/liberica-openjdk-alpine:19.0.2

COPY ./src ./src

RUN mkdir ./out

RUN javac -sourcepath ./src -d out ./src/ru/evgen/calculator/sample/Main.java

CMD java -classpath ./out ru/evgen/calculator/sample/Main 5+7
