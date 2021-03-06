package org.esmerilprogramming.overtownacceptance.withappcontext.controllers;

import io.undertow.io.Sender;
import org.esmerilprogramming.overtown.annotation.Controller;
import org.esmerilprogramming.overtown.annotation.path.Delete;
import org.esmerilprogramming.overtown.annotation.path.Get;
import org.esmerilprogramming.overtown.http.OvertownRequest;

/**
 * Created by efraimgentil<efraimgentil@gmail.com> on 14/03/15.
 */
@Controller
public class DeleteController {

  @Get(template = "index.ftl")
  public void index(OvertownRequest request){

  }

  @Delete
  public void delete(Integer id, OvertownRequest request){
    Sender sender = request.getExchange().getResponseSender();
    sender.send("DELETE - delete/delete - id:" + id);
  }


}
