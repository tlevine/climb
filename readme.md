Climb
============================
Climb is an interface to [Glacier](https://console.aws.amazon.com/glacier/home)
for the shell.

## Install


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
