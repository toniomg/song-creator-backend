pipeline {
   agent any

   stages {
      stage('Download') {
         steps {
            git 'https://github.com/toniomg/song-generator-backend.git'
         }
      }

       stage('Unit Test') {
          steps {
             sh ' ./mvnw test'
           }
       }
   }
}