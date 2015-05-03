/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.karamel.backend.machines;

import se.kth.karamel.backend.running.model.tasks.Task;
import se.kth.karamel.common.exception.KaramelException;

/**
 *
 * @author kamal
 */
public interface TaskSubmitter {

  public void submitTask(Task task) throws KaramelException;
}