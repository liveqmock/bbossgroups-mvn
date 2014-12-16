/*
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.frameworkset.web.servlet.mvc;


/**
 * <p>Title: NativeWebRequest.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2008</p>
 * @Date 2010-10-15
 * @author biaoping.yin
 * @version 1.0
 */
public interface NativeWebRequest extends WebRequest {

	/**
	 * Return the underlying native request object, if available.
	 * @see javax.servlet.http.HttpServletRequest
	 * @see javax.portlet.ActionRequest
	 * @see javax.portlet.RenderRequest
	 */
	Object getNativeRequest();

	/**
	 * Return the underlying native response object, if available.
	 * @see javax.servlet.http.HttpServletResponse
	 * @see javax.portlet.ActionResponse
	 * @see javax.portlet.RenderResponse
	 */
	Object getNativeResponse();

}
