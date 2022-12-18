import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.springframework.boot:spring-boot-starter-web:",
ivy"org.springframework.boot:spring-boot-starter-data-elasticsearch:",
ivy"org.projectlombok:lombok:1.18.8",
ivy"org.apache.tomcat.embed:tomcat-embed-jasper:",
ivy"javax.servlet:jstl:"
  )
}
