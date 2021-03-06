/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.engine.history;





/**
 * A single process variable containing the last value when its process instance has finished.
 * It is only available when HISTORY_LEVEL is set >= VARIABLE
 * 
 * @author Christian Lipphardt (camunda)
 * @author ruecker
 */
public interface HistoricVariableInstance {
  
  /** The unique DB id */
  String getId();
  
  String getVariableName();
  String getVariableTypeName();
  Object getValue();
    
  /** The process instance reference. */
  String getProcessInstanceId();
  
}
