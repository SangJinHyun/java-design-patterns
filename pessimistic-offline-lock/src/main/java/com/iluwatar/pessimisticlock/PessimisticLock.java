package com.iluwatar.pessimisticlock;

import javax.persistence.Entity;
import javax.persistenc.Id;
import org.springframework.data.jpa.repository.JpaRepository;


import javax.persistence.Id;


public class PessimisticLock {

    public static void main (String [] args) {


        // create service to execute

        //spring start
        SpringApplication.run(PessimisticLock.class, args);

        //setup for service data

        // add waitime config
    }


    class Doc{

        private long nameId;
        private Integer num;

    }

    @Repository
    interface DocRepo extends JpaRepository <Doc, Long>{

        @Lock(LockModeType.PESSIMISTIC_WRITE)
        @QueryHints({@QueryHint(name = "javax.persistence.lock.timeout", value = "3000")})


    }



}


