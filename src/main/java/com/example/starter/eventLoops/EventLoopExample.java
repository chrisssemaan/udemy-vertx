package com.example.starter.eventLoops;

import com.example.starter.MainVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

public class EventLoopExample extends AbstractVerticle {



  public static void main(String[] args) {
    var vertx = Vertx.vertx();
    vertx.deployVerticle(new EventLoopExample());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    super.start(startPromise);
  }
}
