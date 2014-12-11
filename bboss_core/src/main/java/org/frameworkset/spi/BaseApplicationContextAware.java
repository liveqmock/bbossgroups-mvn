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

package org.frameworkset.spi;

import com.frameworkset.spi.assemble.BeanInstanceException;

/**
 * <p>Title: BaseApplicationContextAware.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2007</p>
 * @Date 2012-11-21 ����10:23:27
 * @author biaoping.yin
 * @version 1.0
 */
public class BaseApplicationContextAware implements ApplicationContextAware {
	protected BaseApplicationContext applicationContext; 
	public void setApplicationContext(BaseApplicationContext applicationContext)
			throws BeanInstanceException {
		this.applicationContext = applicationContext;
	}

}
