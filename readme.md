Climb
============================
Climb is an interface to [Glacier](https://console.aws.amazon.com/glacier/home)
for the shell.

## Install
### Easy way


### Compiling from source

    #!/bin/sh
    wget http://sdk-for-java.amazonwebservices.com/latest/aws-java-sdk.zip
    unzip aws-java-sdk*.zip

    javac Climb.java -classpath $PWD/aws-java-sdk-1.3.18/lib/aws-java-sdk-1.3.18.jar

## Configure
Store your AWS
[security credentials](https://portal.aws.amazon.com/gp/aws/securityCredentials)
in `.climb`. It should look like this.

    access_key_id=oeusthueaosthueaosth
    secret_access_key=snteumoausanteohusanotehusaotheustaoeuoeu

You can also set a default vault in here.

    access_key_id=oeusthueaosthueaosth
    secret_access_key=snteumoausanteohusanotehusaotheustaoeuoeu
    default_vault=important-stuff

## Usage
To upload file.tar.gz to the default vault, run this.

    climb file.tar.gz

To upload it to the vault "cabinet", run this.

    climb file.tar.gz cabinet
