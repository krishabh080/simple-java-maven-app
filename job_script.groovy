job('lwautojob1') {
    
    description('My first job auto')
    

    scm {
        github(ownerAndProject= krishabh080/simple-java-maven-app, branch = 'master')
              
    }
    steps {
         maven {
            goals('package')
            mavenInstallation('mymaven3')
           
        }
        shell('date')
    }
    
    
}
