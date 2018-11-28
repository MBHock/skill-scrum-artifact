package com.consort.scrumartifact;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.consort.scrumartifact.handler.CancelandStopIntentHandler;
import com.consort.scrumartifact.handler.FallbackIntentHandler;
import com.consort.scrumartifact.handler.HelpIntentHandler;
import com.consort.scrumartifact.handler.LaunchRequestHandler;
import com.consort.scrumartifact.handler.ScrumDailyIntentHandler;
import com.consort.scrumartifact.handler.ScrumIntentHandler;
import com.consort.scrumartifact.handler.SessionEndedRequestHandler;

public class ScrumArtifactHandler extends SkillStreamHandler {

  //@formatter:off
  private static Skill getSkill() {
    return Skills.standard()
        .addRequestHandlers(
            new CancelandStopIntentHandler(), 
            new ScrumDailyIntentHandler(), 
            new HelpIntentHandler(),
            new LaunchRequestHandler(), 
            new SessionEndedRequestHandler(), 
            new FallbackIntentHandler(),
            new ScrumIntentHandler())
        .build();
  }
  //@formatter:on

  public ScrumArtifactHandler() {
    super(getSkill());
  }
}
