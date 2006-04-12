/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004 The Sakai Foundation.
 * 
 * Licensed under the Educational Community License, Version 1.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *      http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.jsf.help;

import javax.faces.webapp.UIComponentTag;

/**
 * help set default action tag
 * @version $Id$
 */
public class HelpSetDefaultActionTag extends UIComponentTag
{
  /** 
   * @see javax.faces.webapp.UIComponentTag#getComponentType()
   */
  public String getComponentType()
  {
    return "SetDefaultAction";
  }

  /** 
   * @see javax.faces.webapp.UIComponentTag#getRendererType()
   */
  public String getRendererType()
  {
    return null;
  }

}