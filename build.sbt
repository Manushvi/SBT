
lazy val root = (project in file("."))
  .aggregate(subproject1, subproject2)

lazy val subproject1 = (project in file("sub-project-1"))

lazy val subproject2 = (project in file("sub-project-2"))
  .dependsOn(subproject1)