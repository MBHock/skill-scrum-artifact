/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.consort.scrumartifact.handler;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class ScrumDailyIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("ScrumDailyIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input) {
    String speechText = "As described in the Scrum Guide, the Daily Scrum is a fifteen-minute time-boxed event for the Development Team to synchronize activities and create a plan for the next twentyfour hours";
    return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Scrum", speechText).build();
  }

}
