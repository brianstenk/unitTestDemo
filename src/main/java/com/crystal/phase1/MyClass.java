package com.crystal.phase1;
/*sds
* my class has your details and a secret that is used to create a key (secret*id  gives a key)
* and the key is used to unlock the lock
* */
public class MyClass {
    private Integer id;
    private String name;
    private Integer secret;

    public Integer calculateKey(){
        return id*secret;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSecret() {
        return secret;
    }

    public void setSecret(Integer secret) {
        this.secret = secret;
    }
}
