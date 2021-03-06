name := "byzantine"

version := "1.0"

scalaVersion := "2.12.1"
lazy val akkaVersion = "2.5.3"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %%  "akka-actor"       % akkaVersion,
  "com.roundeights" %% "hasher" % "1.2.0",
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"

  //  "com.typesafe.akka" %%  "akka-slf4j"       % akkaVersion    % "test",
  //  "ch.qos.logback"    %   "logback-classic"  % "1.1.3"        % "test",
  //  "com.typesafe.akka" %%  "akka-testkit"     % akkaVersion    % "test",
  //  "org.scalatest"     %%  "scalatest"        % "3.0.1"        % "test",
)